package com.rest.udemy.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundoControlador {
	@GetMapping("/holamundo")
	public String holaMundo() {
		return "hola Mundo";
	}
	
	@GetMapping("/holamundo-bean")
	public holamundoBean holaMundoBean() {
		return new holamundoBean("hola Mundo");
	}
	
	@GetMapping("/holamundo-path/{nombre}")
	public holamundoBean holaMundoPath(@PathVariable String nombre) {
		return new holamundoBean("hola Mundo " + nombre);
	}

}
