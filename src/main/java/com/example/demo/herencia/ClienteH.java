package com.example.demo.herencia;

import org.springframework.stereotype.Component;

@Component
public class ClienteH {

	private String nombres;
	private String cedula;
	
	protected Integer decuentoAp() {
		System.out.println("Sin descuento");
return 0;	
	}
	
	//getters and setters
	protected String getNombres() {
		return nombres;
	}
	protected void setNombres(String nombres) {
		this.nombres = nombres;
	}
	protected String getCedula() {
		return cedula;
	}
	protected void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombres=" + nombres + ", cedula=" + cedula + "]";
	}
	
	
	
}
