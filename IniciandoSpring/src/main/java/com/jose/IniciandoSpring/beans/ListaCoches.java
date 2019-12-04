package com.jose.IniciandoSpring.beans;

import java.util.ArrayList;
import java.util.List;

public class ListaCoches {

	
	private ArrayList<CocheBean> lista = null;
	private static ListaCoches listaCoches = null;
	
	private ListaCoches() {
		
		lista = new ArrayList<CocheBean>();
	}
	
	
public List<CocheBean> getDatos() {
		
		return lista;
	}

private int getIdNoRepetido() {
	
	int numero = (int)(Math.random()*100)+1;
	
	//busco hasta que no lo encuentro
	while(buscarDondeEsta(numero)>=0) {
		
		numero = (int)(Math.random()*100)+1;
	}
	return numero;
}


public CocheBean getCoche(int idBuscado) {
	
	int dondeEsta = buscarDondeEsta(idBuscado);
	
	if(dondeEsta >= 0) {
		return lista.get(dondeEsta);
	}
	else return null;
	
		
}


/**
 * metodo que añade coche a la lista de coches 
 * @param coche
 */

public void addCoche(CocheBean coche){
	
	coche.setId(getIdNoRepetido());
	lista.add(coche);
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
public static ListaCoches getLista() {
	
	if(listaCoches==null) {
		
		listaCoches = new ListaCoches();
	}
	
	return listaCoches;
}
}
