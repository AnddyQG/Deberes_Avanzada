package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class ClienteSB {

	private String nombres;
	private String cedula;
	
	public Integer decuentoAp() {
		System.out.println("Sin descuento");
return 0;	
	}
	
	//getters and setters
	
	
	
	@Override
	public String toString() {
		return "Cliente [nombres=" + nombres + ", cedula=" + cedula + "]";
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
}
