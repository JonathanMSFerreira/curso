package com.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cidades")
public class CidadeController {

	
@RequestMapping("/nova")
public String novo(){
	
	return "cidade/CadastroCidade";
	
}
	
	
	
}
