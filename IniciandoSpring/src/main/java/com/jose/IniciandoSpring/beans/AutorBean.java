package com.jose.IniciandoSpring.beans;

public class AutorBean {
	private int id;
	private String nombre;
	private int edad;
	private String email;
	
	
	
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getEdad() {
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
