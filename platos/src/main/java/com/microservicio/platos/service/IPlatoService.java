package com.microservicio.platos.service;

import com.microservicio.platos.dto.PlatoDTO;

public interface IPlatoService {
	
	void savePlato(PlatoDTO plato);
	PlatoDTO verPlatoPorId(Long id);
	PlatoDTO editarPlato(PlatoDTO plato);
	void eliminarPlato(Long id);

}
