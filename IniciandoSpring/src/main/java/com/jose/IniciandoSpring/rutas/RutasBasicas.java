package com.jose.IniciandoSpring.rutas;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jose.IniciandoSpring.beans.AutorBean;
import com.jose.IniciandoSpring.beans.ListaAutores;

@Controller
public class RutasBasicas {

	/*@GetMapping("/start/{nombre}/{edad}")
	public String rutaBasicaInicial(@PathVariable String nombre,
									@PathVariable Integer edad,
									Model model) {
		
		model.addAttribute("nombre",nombre);
		model.addAttribute("edad",edad);
		
		
		return "hola";
	}*/
	
	@GetMapping("/start")
	public String rutaBasicaInicial(Model model) {
		
		 List<AutorBean> lista = ListaAutores.construirLista();
		model.addAttribute("autores",lista);
		
		return "hola";
	}
	
	@GetMapping("/start/dentro")
	public String rutaBasicaSDentro() {
		System.out.println("Alguien ha llegado al servidor mas a dentro");
		System.out.println("Enhorabuena!!");
		return "ERES LA CAÑA CHAVAL!!!!";
	}
	
	@GetMapping("/comienzo")
	public String rutaCero(@PathVariable  (required=false) Integer id,
						 @PathVariable (required=false) String nombre) {
		
		System.out.println("Han llegado al path inicial");
		return "cero";
	}
	
	@GetMapping("/autores/{id}")
	public String verAutorl(@PathVariable Integer id , Model model) {
		
		AutorBean autor = ListaAutores.getAutor(id);
		model.addAttribute("autor",autor);

		
		return "autor";
	}
	
	

}
