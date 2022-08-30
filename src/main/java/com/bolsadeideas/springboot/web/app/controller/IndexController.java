package com.bolsadeideas.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
    	model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	}
    
    @RequestMapping("/perfil")
    public String perfil(Model model){
    	Usuario usuario = new Usuario();
    	usuario.setNombre("Andrés");
    	usuario.setApellido("Medina");
    	usuario.setEmail("andres@correo.com");
    	model.addAttribute("usuario", usuario);
    	model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()) );
    	return "perfil";
    }
    
    @RequestMapping("/listar")
    public String listar(Model model){
    	List<Usuario> usuarios = new ArrayList<>();
    	usuarios.add(new Usuario("Andres", "Martínez", "amart@gmail.com"));
    	usuarios.add(new Usuario("Esteban", "Medina", "emidna@gmail.com"));
    	usuarios.add(new Usuario("Carlos", "Perez", "saolat@gmail.com"));
    	model.addAttribute("titulo","Lista de Usuarios");
    	model.addAttribute("usuarios", usuarios);
    	return "listar";
    }
}


