package com.jose.IniciandoSpring.beans;

public class AutorBean {
	private Integer id;
	private String nombre;
	private Integer edad;
	private String email;
	private String coche;
	private String mensaje;
	private Integer rango;
	private boolean carnetConducir;
	
	
	
	
	
	

	public boolean isCarnetConducir() {
		return carnetConducir;
	}
	public void setCarnetConducir(boolean carnetConducir) {
		this.carnetConducir = carnetConducir;
	}
	public Integer getRango() {
		return rango;
	}
	public void setRango(Integer rango) {
		this.rango = rango;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
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
