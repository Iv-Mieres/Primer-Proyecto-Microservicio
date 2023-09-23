package com.microservicio.ingredientes.service;

import java.util.List;

import com.microservicio.ingredientes.dto.request.IngredienteDTO;
import com.microservicio.ingredientes.dto.response.IngredienteDTORes;

public interface IIngredienteService {
	
	void saveIngrediente(IngredienteDTO ingrediente);
	IngredienteDTORes verIngredientePorId(Long id);
	List<IngredienteDTORes> listaIngredientesPorNombrePlato(String plato); 

}
