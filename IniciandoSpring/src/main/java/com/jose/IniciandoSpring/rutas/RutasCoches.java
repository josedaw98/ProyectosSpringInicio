package com.jose.IniciandoSpring.rutas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.jose.IniciandoSpring.beans.AutorBean;
import com.jose.IniciandoSpring.beans.CocheBean;
import com.jose.IniciandoSpring.beans.ListaAutores;
import com.jose.IniciandoSpring.beans.ListaCoches;

@Controller
public class RutasCoches {

	ListaCoches lista = ListaCoches.getLista();
	
	@GetMapping("/coches")
	public ModelAndView rutaBasicaCoches(@ModelAttribute CocheBean coche) {
		
		
		//creamos el model View 
		ModelAndView model = new ModelAndView("CocheInicio");
		
		lista.addCoche(coche);
		
		model.addObject("coches",lista.getDatos());
		
		return model;
		
	}
	
}
