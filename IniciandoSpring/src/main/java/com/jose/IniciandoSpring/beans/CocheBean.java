package com.jose.IniciandoSpring.beans;

public class CocheBean {

	private Integer id;
	private String marca;
	
	
	
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
		return "CocheBean [id=" + id + ", marca=" + marca + "]";
	}
	
}
