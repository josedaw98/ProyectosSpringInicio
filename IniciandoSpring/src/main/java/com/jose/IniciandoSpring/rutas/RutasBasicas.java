package com.jose.IniciandoSpring.rutas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jose.IniciandoSpring.beans.AutorBean;
import com.jose.IniciandoSpring.beans.ListaAutores;

@Controller
public class RutasBasicas {
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

	@GetMapping("/")
	public String rutaBasicaInicial(Model model) {
		
		List<AutorBean> listaAutores = ListaAutores.getLista();
		model.addAttribute("autores",listaAutores);

		return "hola";
	}
	
	@GetMapping("/eliminar/{id}")
	public String rutaEminar(@PathVariable Integer id,
								Model model) {
		
		
		
		List<AutorBean> listaAutores = ListaAutores.getLista();
		ListaAutores.del(id);
		model.addAttribute("autores",listaAutores);
		
		
		return "hola";
	}
	
	

	
	


	@GetMapping("/autores/{id}")
	public String verAutor(	@PathVariable Integer id,
							Model model) {
		
		AutorBean autor = ListaAutores.getAutor(id);
		model.addAttribute("autor",autor);
		
		return "autor"; //html
	}	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/comienzo")
	public String rutaCero(	@RequestParam(required=false) Integer id, 
							@RequestParam(required=false) String nombre) {
		
		System.out.println("id: "+id);
		System.out.println("nombre: "+nombre);
		
		return "cero";
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