package com.jose.IniciandoSpring.beans;

public class AutorBean {
	private Integer id;
	private String nombre;
	private Integer edad;
	private String email;
	private String coche;
	
	
	
	
	
	

	public String getCoche() {
		return coche;
	}
	public void setCoche(String coche) {
		this.coche = coche;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "AutorBean [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}
	

	
}
