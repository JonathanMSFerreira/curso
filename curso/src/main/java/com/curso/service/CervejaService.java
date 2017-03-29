package com.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Cerveja;
import com.curso.repository.CervejaRepository;

@Service
public class CervejaService {

	@Autowired
	CervejaRepository cervejaRepository;

	public void salvarCerveja(Cerveja cerveja) {

		cervejaRepository.save(cerveja);

	}

}
