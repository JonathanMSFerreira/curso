package com.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cerveja")
public class CervejaController {

	
@RequestMapping("/novo")
public String novo(){
	
	return "cerveja/CadastroCerveja";
	
}
	
	
	
}
