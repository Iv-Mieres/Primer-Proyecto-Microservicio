package com.microservicio.platos.service;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservicio.platos.dto.IngredienteDTO;
import com.microservicio.platos.dto.PlatoDTO;
import com.microservicio.platos.model.Plato;
import com.microservicio.platos.repository.IPlatoRepository;

@Service
public class PlatoService implements IPlatoService{

	@Autowired
	private IPlatoRepository platoRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public void savePlato(PlatoDTO plato) {
		String endpoint = "http://localhost:9002/ingredientes/"; 
		var guardarPlato = modelMapper.map(plato, Plato.class);
		var nombreIngredientes = new ArrayList<String>();
		
		for (IngredienteDTO ingrediente: restTemplate.getForObject(endpoint + plato.getNombre(), IngredienteDTO[].class)) {
			nombreIngredientes.add(ingrediente.getNombreIngrediente());
		}		
		guardarPlato.setIngredientes(nombreIngredientes);
		platoRepository.save(guardarPlato);			
	}

	@Override
	public PlatoDTO verPlatoPorId(Long id) {
		return  modelMapper.map(platoRepository.findById(id), PlatoDTO.class);
	}

	@Override
	public PlatoDTO editarPlato(PlatoDTO plato) {
		
		return null;
	}

	@Override
	public void eliminarPlato(Long id) {
	}
	
	
	
	
}
