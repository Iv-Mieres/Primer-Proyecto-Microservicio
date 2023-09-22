package com.microservicio.platos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.platos.dto.PlatoDTO;
import com.microservicio.platos.repository.IPlatoRepository;

@Service
public class PlatoService implements IPlatoService{

	@Autowired
	private IPlatoRepository platoRepository;
	

	@Override
	public void savePlato(PlatoDTO plato) {
	}

	@Override
	public PlatoDTO verPlatoPorId(Long id) {
		
		return null;
	}

	@Override
	public PlatoDTO editarPlato(PlatoDTO plato) {
		
		return null;
	}

	@Override
	public void eliminarPlato(Long id) {
	}
	
	
	
	
}
