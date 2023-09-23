package com.microservicio.platos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.platos.dto.PlatoDTO;
import com.microservicio.platos.service.IPlatoService;

@RestController
@RequestMapping("/platos")
public class PlatoController {

	
	@Autowired
	private IPlatoService platoService;
	
	@PostMapping()
	public ResponseEntity<HttpStatus> guardarPlato(@RequestBody PlatoDTO plato){
		platoService.savePlato(plato);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PlatoDTO> verPlato(@PathVariable Long id){
		return ResponseEntity.ok(platoService.verPlatoPorId(id));
	}
	
	
	
	
	
}
