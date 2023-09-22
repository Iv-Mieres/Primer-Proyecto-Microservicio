package com.microservicio.ingredientes.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.ingredientes.dto.IngredienteDTO;
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
	public IngredienteDTO verIngredientePorId(Long id) {
		return modelMapper
				.map(ingredientesRepository.findById(id).orElse(null), IngredienteDTO.class);
	}

	@Override
	public List<Ingrediente> listaIngredietesPorNombrePlato(String plato) {
		return ingredientesRepository.findByPlatosNombre(plato);
	}
	
	

}
