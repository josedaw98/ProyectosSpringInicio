package com.jose.IniciandoSpring.beans;

import java.util.ArrayList;
import java.util.List;

public class ListaAutores {

private static ArrayList<AutorBean> lista = null;

	
	private ListaAutores() {
		
		lista = new ArrayList();
		
		AutorBean autor = new AutorBean();
		int id = getIdNoRepetido();
		autor.setId(id);
		autor.setNombre("Ket Follet");
		autor.setEdad(70);
		autor.setEmail("kent@educastur.org");
		lista.add(autor);
		

		AutorBean autor2 = new AutorBean();
		int id2 = getIdNoRepetido();
		autor2.setId(id2);
		autor2.setNombre("JK Rowling");
		autor2.setEdad(58);
		autor2.setEmail("jk@educastur.org");
		lista.add(autor2);		
		

		AutorBean autor3 = new AutorBean();
		int id3 = getIdNoRepetido();
		autor3.setId(id3);
		autor3.setNombre("Perez Reverte");
		autor3.setEdad(62);
		autor3.setEmail("aurturo@educastur.org");
		lista.add(autor3);		
		

		AutorBean autor4 = new AutorBean();
		int id4 = getIdNoRepetido();
		autor4.setId(id4);
		autor4.setNombre("Orson Scott Card");
		autor4.setEdad(62);
		autor4.setEmail("orson@educastur.org");
		lista.add(autor4);
		
		
}
	/**
	 * Devuleve a todos los autores
	 * @return
	 */
	public static List<AutorBean> getLista() {
		
		if(lista==null) {
			
			new ListaAutores();
		}
		
		return lista;
	}
	
	
	
	
	
	
	
	/**
	 * Devuelve un autor en concreto, si lo encuentra
	 * @param id
	 * @return
	 */
	public static AutorBean getAutor(int idBuscado) {
		
		//BUSCO DONDE ESTA EN EL ARRAY
		int dondeEsta = buscarDondeEsta(idBuscado);
		
		//SI ME DEVUELVE UNA POSICION VALIDA
		if(dondeEsta>=0) {
			
			return lista.get(dondeEsta);
		}
		else return null;
	}	
	
	
	
	
	/**
	 * Borra un objeto
	 * @param idBuscado
	 */
	public static void del(int idBuscado) {
		
		//PREGUNTO SI ESTA EL AUTOR
		int dondeEsta = buscarDondeEsta(idBuscado);
		
		//SI LO ESTA LO ELIMINO
		if(dondeEsta>=0) {
			
			lista.remove(dondeEsta);
		}
	}
	
	
	
	
	
	
	/**
	 * 
	 * @param idBuscado
	 * @return la posicion en el array donde se encuentra
	 */
	private static int buscarDondeEsta(int idBuscado) {
		
		//iniciamos con una bandera indicando que no esta encontrado
		boolean encontrado = false;
		
		int indice = 0;
		
		//mientras que no se encuentra y no llego al final 
		while((!encontrado)&&(indice<lista.size())) {
			
			//lo voy buscando
			if(lista.get(indice).getId()==idBuscado) {
				
				encontrado = true;
			}
			
			//si no aparece, avanzo
			else indice ++;
		}
		if(encontrado) return indice; else return -1;
	}	

	
	private int getIdNoRepetido() {
		//creamos un numero 
		int numero = (int)(Math.random()*100+1);
		
		//repetimos hasta que no encuentre el numero 
		while(buscarDondeEsta(numero) != -1) {
			
			//creamos otro numero
			numero = (int)(Math.random()*100+1);
			
		}
		
		//devolvemos numero
		return numero;
		
	}
}
