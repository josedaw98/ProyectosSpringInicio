package com.jose.IniciandoSpring.beans;

import java.util.ArrayList;
import java.util.List;

public class ListaAutores {

	private static ArrayList<AutorBean> lista = new ArrayList<AutorBean>();
	
	
	/**
	 * Devuelve un autor en concreto
	 * @param id
	 * @return
	 */
	public static AutorBean getAutor(int id) {

		
		return lista.get(id);
		
	}
	
	/**
	 * crea y añade autores a una lista 
	 * @return
	 */
		public static List<AutorBean> construirLista(){
			

			AutorBean autor = new AutorBean();
			autor.setId(0);
			autor.setNombre("jose");
			autor.setEdad(71);
			autor.setEmail("joserrf98@gmail.com");
			lista.add(autor);
			
			AutorBean autor2 = new AutorBean();
			autor2.setId(1);
			autor2.setNombre("lluis");
			autor2.setEdad(71);
			autor2.setEmail("lluis98@gmail.com");
			lista.add(autor2);
			
			AutorBean autor3 = new AutorBean();
			autor3.setId(2);
			autor3.setNombre("carlos");
			autor3.setEdad(71);
			autor3.setEmail("carlos98@gmail.com");
			lista.add(autor3);
			
			AutorBean autor4 = new AutorBean();
			autor4.setId(3);
			autor4.setNombre("pablo");
			autor4.setEdad(71);
			autor4.setEmail("pablo98@gmail.com");
			lista.add(autor4);
			
			
			
			return lista;
			
			
		}
		
		
}
