package com.microservicio.platos.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteDTO {
	
	private Long id;
	private String nombreIngrediente;
	private List<String> platos ;

}
