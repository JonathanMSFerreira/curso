package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.model.Cerveja;

@Repository
public interface CervejaRepository extends JpaRepository<Cerveja, Long>{

}
