package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemplosVariablesRuta {
		@GetMapping("/")
		public String index(Model model) {
			model.addAttribute("titulo", "Enviar parametros de la ruta (@PathVariable)");
			return "variables/index";
		}
	
		@GetMapping("/string/{texto}")
		public String variables(@PathVariable String texto, Model model) {
			
			model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
			model.addAttribute("resultado", "El texto es: ".concat(texto));		
			return "variables/ver";
		}
		
		@GetMapping("/string/{texto}/{nombres}")
		public String variables(@PathVariable String texto, @PathVariable String nombres,Model model) {
			
			model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
			model.addAttribute("resultado", "El texto es: ".concat(texto).concat(" y el nombre es:").concat(nombres));		
			return "variables/ver";
		}

}
