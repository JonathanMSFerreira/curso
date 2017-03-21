package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.curso.model.Origem;
import com.curso.model.Sabor;
import com.curso.repository.EstiloRepository;

@Controller
@RequestMapping("cerveja")
public class CervejaController {

	@Autowired
	EstiloRepository estilos;

	@RequestMapping("/novo")
	public ModelAndView novo() {

		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		mv.addObject("sabores", Sabor.values());
		mv.addObject("origens", Origem.values());
		mv.addObject("estilos", estilos.findAll());

		return mv;

	}

}
