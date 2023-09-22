package com.microservicio.ingredientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.ingredientes.dto.IngredienteDTO;
import com.microservicio.ingredientes.service.IIngredienteService;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {
	
	@Autowired
	private IIngredienteService ingredienteService;
	
	@PostMapping()
	public ResponseEntity<HttpStatus> saveIngrediente(@RequestBody IngredienteDTO ingrediente){
		ingredienteService.saveIngrediente(ingrediente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	

}
