package com.jose.IniciandoSpring.beans;

public class CocheBean {

	private Integer id;
	private String marca;
	private String dueño;
	private Integer precio;
	private Integer Valoracion;
	
	
	
	
	
	public String getDueño() {
		return dueño;
	}
	public void setDueño(String dueño) {
		this.dueño = dueño;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Integer getValoracion() {
		return Valoracion;
	}
	public void setValoracion(Integer valoracion) {
		Valoracion = valoracion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	@Override
	public String toString() {
		return "CocheBean [id=" + id + ", marca=" + marca + ", dueño=" + dueño + ", precio=" + precio + ", Valoracion="
				+ Valoracion + "]";
	}
	
}
