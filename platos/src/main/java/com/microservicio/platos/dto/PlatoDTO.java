package com.microservicio.platos.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDTO {

	private Long id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private List<String> ingredientes;
	
}
