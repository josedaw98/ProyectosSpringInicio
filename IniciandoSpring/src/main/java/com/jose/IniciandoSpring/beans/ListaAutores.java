package com.jose.IniciandoSpring.beans;

import java.util.ArrayList;
import java.util.List;

public class ListaAutores {

	
	private ArrayList<AutorBean> lista = null;
	private static ListaAutores listaAutores = null;
	
	
	private ListaAutores() {
		
		lista = new ArrayList<AutorBean>();

	}
	


	/**
	 * 
	 * @return
	 */
	public List<AutorBean> getDatos() {
		
		return lista;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private int getIdNoRepetido() {
		
		int numero = (int)(Math.random()*100)+1;
		
		// busco hasta que no lo encuentro
		while(buscarDondeEsta(numero)>=0) {

			numero = (int)(Math.random()*100)+1;
		}
		return numero;
	}





	
	
	
	
	
	
	
	
	/**
	 * Devuelve un autor en concreto, si lo encuentra
	 * @param id
	 * @return
	 */
	public AutorBean getAutor(int idBuscado) {
		
		// busco donde está en el array
		int dondeEsta = buscarDondeEsta(idBuscado);
		
		// si me devuelve una posición válida
		if(dondeEsta>=0) {
			
			return lista.get(dondeEsta);
		}
		else return null;
	}	
	
	/**
	 * metodo que añade autor a la lista de autores 
	 * @param autor
	 */
	
	public void AddAutor(AutorBean autor) {
		
		autor.setId(getIdNoRepetido());
		lista.add(autor);
	}
	
	/**
	 * actualiza un autor buscando primero su posicion en la lista 
	 * @param autor
	 */
	public void updateAutor(AutorBean autor) {
		
		int posicion = buscarDondeEsta(autor.getId());
		lista.set(posicion, autor);
	}
	
	
	
	/**
	 * Borra un objeto
	 * @param idBuscado
	 */
	public void del(int idBuscado) {
		
		// pregunto que si existe el ID
		int dondeEsta = buscarDondeEsta(idBuscado);
		
		// si lo encuentra, lo borra
		if(dondeEsta>=0) {
			
			lista.remove(dondeEsta);
		}
	}
	
	
	
	
	 
	
	/**
	 * 
	 * @param idBuscado
	 * @return posición en el arrayList donde se encuentra
	 */
	private int buscarDondeEsta(int idBuscado) {
		
		// iniciamos con una bandera indicando que no está encontrado
		boolean encontrado = false;
		
		
		int indice = 0;
		// mientras que no se encuentra y no llego al final
		while((!encontrado)&&(indice<lista.size())) {
			
			// lo voy buscando
			if(lista.get(indice).getId()==idBuscado) {
				
				encontrado = true;
			}
			// y si no aparece, avanzo
			else indice ++;
		}
		if(encontrado) return indice; else return -1;
	}	
	
	

	
	
	/**
	 * peticion singleton
	 * @return
	 */
	public static ListaAutores getLista() {
		
		if(listaAutores==null) {
			
			listaAutores = new ListaAutores();
		}
		
		return listaAutores;
	}
	
}