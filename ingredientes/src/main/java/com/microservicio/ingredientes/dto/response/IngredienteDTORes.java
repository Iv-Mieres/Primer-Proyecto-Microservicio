package com.microservicio.ingredientes.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteDTORes {

	private Long id;
	private String nombreIngrediente;
	
}
