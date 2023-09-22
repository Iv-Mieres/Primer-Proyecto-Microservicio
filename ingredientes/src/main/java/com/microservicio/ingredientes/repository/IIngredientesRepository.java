package com.microservicio.ingredientes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.ingredientes.model.Ingrediente;

@Repository
public interface IIngredientesRepository extends JpaRepository<Ingrediente, Long>{

	List<Ingrediente> findByPlatosNombre(String nombre);
}
