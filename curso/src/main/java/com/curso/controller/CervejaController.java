package com.curso.controller;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.curso.model.Cerveja;
import com.curso.model.Origem;
import com.curso.model.Sabor;
import com.curso.repository.CervejaRepository;
import com.curso.repository.EstiloRepository;
import com.curso.service.CervejaService;

@Controller
@RequestMapping("cerveja")
public class CervejaController {

	@Autowired
	EstiloRepository estilos;
	
	@Autowired
	CervejaRepository cervejas;

	@Autowired
	CervejaService cervejaService;
	
	@RequestMapping("/novo")
	public ModelAndView novo(Cerveja cerveja){

		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		mv.addObject("sabores", Sabor.values());
		mv.addObject("origens", Origem.values());
		mv.addObject("estilos", estilos.findAll());
		mv.addObject("cervejas", cervejas.findAll());
		
		
		
		
		return mv;

	}

	@PostMapping("/novo")
	public ModelAndView salvarCerveja(@Valid Cerveja cerveja, BindingResult result, RedirectAttributes attributes) {


		
		if (result.hasErrors()) {

			return novo(cerveja);

		}
		
		cervejaService.salvarCerveja(cerveja);
		attributes.addFlashAttribute("mensagem", "Cerveja cadastrada");

		return new ModelAndView("redirect:/cerveja/novo");

	}

}
