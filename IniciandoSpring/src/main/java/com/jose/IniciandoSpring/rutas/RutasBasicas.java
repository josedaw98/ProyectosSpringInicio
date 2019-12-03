package com.jose.IniciandoSpring.rutas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;
import com.jose.IniciandoSpring.beans.AutorBean;
import com.jose.IniciandoSpring.beans.CocheBean;
import com.jose.IniciandoSpring.beans.ListaAutores;

@Controller
public class RutasBasicas {
	
	ListaAutores lista = ListaAutores.getLista();
/*
	@Autowired
	AutorBean marcos;
	
	
	@Autowired
	AutorBean juan;
*/	
	
	
	
	
	/*
	@GetMapping("/start/{nombre}/{edad}")
	public String rutaBasicaInicial(@PathVariable String nombre,
									@PathVariable Integer edad,
									Model model) {
	*/

	
	/*LISTA AUTORES*/
	@GetMapping("/")
	public ModelAndView rutaBasicaInicial() {
		
		
		
		ArrayList<CocheBean> ListaCoches = CrearListaCoche();
		
		//creamos el modelAndView
		ModelAndView model = new ModelAndView("hola");
		
		//creamos un objeto de nuevo cochey los añadimo al modelo para poder rellenarlo
		model.addObject("coches",ListaCoches);
		
		//ListaAutores lista = ListaAutores.getLista();//LLAMAMOS AL SINGLETON
		model.addObject("autores",lista.getDatos());
		
		//Añadimos un nombre y una persona 
		model.addObject("nombre","jose");
 
		return model;
	}
	
	

	
	/*MUESTRA MAS DETALLES DEL AUTOR*/
	@GetMapping("/autores/{id}")
	public String verAutor(	@PathVariable Integer id,
							Model model) {
		
		//ListaAutores lista = ListaAutores.getLista();//LLAMAMOS AL SINGLETON
		AutorBean autor = lista.getAutor(id);
		model.addAttribute("autor",autor);
		
		return "autor"; //html
	}	
	
	@GetMapping("/actualizarAutor/{id}")
	public String actualizarAutor(Model model , @PathVariable Integer id) {
		//ListaAutores lista = ListaAutores.getLista();
		AutorBean autor = lista.getAutor(id);
		ArrayList<CocheBean> ListaCoches = CrearListaCoche();
		
		model.addAttribute("coches",ListaCoches);//creamos un objeto de nuevo cochey los añadimo al modelo para poder rellenarlo
		
		model.addAttribute("autor",autor);//creamos un objeto de nuevo autor y los añadimo al modelo para poder rellenarlo
		
		return "actualizarAutor";//html formulario nuevo autor 		
		
	}
	
	@PostMapping("/update")//post por que envia mucha informacion
	public String update(@ModelAttribute AutorBean autor) {
		
		System.out.println(autor + "actualizado");
		
		lista.updateAutor(autor);
		
		return "redirect:/"; 		
		
	}
	
	@GetMapping("/nuevoAutor")
	public String nuevoAutor(Model model) {
		ArrayList<CocheBean> ListaCoches = CrearListaCoche();
		
		model.addAttribute("coches",ListaCoches);//creamos un objeto de nuevo cochey los añadimo al modelo para poder rellenarlo
		model.addAttribute("autor",new AutorBean());//creamos un objeto de nuevo autor y los añadimo al modelo para poder rellenarlo
		
		return "nuevoAutor";//html formulario nuevo autor 		
		
	}





	
	
	@PostMapping("/addAutor")//post por que envia mucha informacion
	public String addAutor(@ModelAttribute AutorBean autor) {
		
		System.out.println(autor);
		//ListaAutores lista = ListaAutores.getLista();
		lista.AddAutor(autor);
		
		return "redirect:/"; 		
		
	}
	

	
	
	@GetMapping("/eliminar/{id}")
	public String eliminarAutor(	@PathVariable Integer id,
									Model model) {
		
		//ListaAutores lista = ListaAutores.getLista();
		lista.del(id);
		
		/*  
		 * ME LO CURRO YO
		 *
		model.addAttribute("autores",lista.getDatos());
		
		return "hola"; //html
		
		*/
		
		return ("redirect:/");//redireccionamos a la ruta que queremos 
	}	

	

/**
 * crea una lista y les añade coches
 * @return devuelve la lista de coches
 */

private ArrayList<CocheBean> CrearListaCoche() {
	ArrayList<CocheBean> ListaCoches  = new ArrayList<CocheBean>();
	CocheBean volvo = new CocheBean();
	volvo.setId(1);
	volvo.setMarca("volvo");
	
	CocheBean ford = new CocheBean();
	ford.setId(2);
	ford.setMarca("ford");
	
	ListaCoches.add(volvo);
	ListaCoches.add(ford);
	
	return ListaCoches;
}

}


/*
 * 	
	@GetMapping("/start/{nombre}/{edad}")
	public String rutaBasicaInicial(@PathVariable String nombre,
									@PathVariable Integer edad,
									Model model,
									HttpServletRequest  request) {
		
		model.addAttribute("nombre",nombre);
		model.addAttribute("edad",edad);
		
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(marcos);
		lista.add(juan);
		model.addAttribute("personas",lista);
		
		
		System.out.println(request.getServerName());
		System.out.println(request.getMethod());
		System.out.println(request.getRemoteAddr());	
		System.out.println(request.getServletPath());
		Enumeration<String>  cols = request.getPathInfo();
		while(cols.hasMoreElements()) {
			
			System.out.println(cols.nextElement());
		}
		
		return "hola";
	}
	*/	