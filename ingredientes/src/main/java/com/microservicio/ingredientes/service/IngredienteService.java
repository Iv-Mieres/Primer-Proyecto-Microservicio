package com.microservicio.ingredientes.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.ingredientes.dto.request.IngredienteDTO;
import com.microservicio.ingredientes.dto.response.IngredienteDTORes;
import com.microservicio.ingredientes.model.Ingrediente;
import com.microservicio.ingredientes.repository.IIngredientesRepository;

@Service
public class IngredienteService implements IIngredienteService{
	
	
	@Autowired
	private IIngredientesRepository ingredientesRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public void saveIngrediente(IngredienteDTO ingrediente) {
		ingredientesRepository.save(modelMapper.map(ingrediente, Ingrediente.class));	
	}

	@Override
	public IngredienteDTORes verIngredientePorId(Long id) {
		return modelMapper
				.map(ingredientesRepository.findById(id).orElse(null), IngredienteDTORes.class);
	}

	@Override
	public List<IngredienteDTORes> listaIngredientesPorNombrePlato(String plato) {
		var ingredientes = ingredientesRepository.findByPlatos(plato);
		var ingredientesDTO = new ArrayList<IngredienteDTORes>();
		
		for (Ingrediente ingrediente : ingredientes) {
			ingredientesDTO.add(modelMapper.map(ingrediente, IngredienteDTORes.class));
		}
		return ingredientesDTO;
	}
	
	

}
