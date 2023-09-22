package com.microservicio.ingredientes.service;

import java.util.List;

import com.microservicio.ingredientes.dto.IngredienteDTO;
import com.microservicio.ingredientes.model.Ingrediente;

public interface IIngredienteService {
	
	void saveIngrediente(IngredienteDTO ingrediente);
	IngredienteDTO verIngredientePorId(Long id);
	List<Ingrediente> listaIngredietesPorNombrePlato(String plato); 

}
