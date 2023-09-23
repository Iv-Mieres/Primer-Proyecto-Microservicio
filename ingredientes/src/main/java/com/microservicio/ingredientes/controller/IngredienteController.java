package com.microservicio.ingredientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.ingredientes.dto.request.IngredienteDTO;
import com.microservicio.ingredientes.dto.response.IngredienteDTORes;
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
	
	@GetMapping("/{plato}")
	public ResponseEntity<List<IngredienteDTORes>> listaIngredientes(@PathVariable String plato){
		return ResponseEntity.status(HttpStatus.OK)
				.body(ingredienteService.listaIngredientesPorNombrePlato(plato));
	}
		

}
