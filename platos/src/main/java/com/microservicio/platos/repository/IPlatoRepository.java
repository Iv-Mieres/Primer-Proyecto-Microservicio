package com.microservicio.platos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.platos.model.Plato;

@Repository
public interface IPlatoRepository extends JpaRepository<Plato, Long>{

}
