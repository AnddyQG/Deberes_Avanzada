package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;
@Component
public class ClienteDiscapacidadSB extends ClienteSB{

	public Integer decuentoAp() {
		System.out.println("Cliente con discapacidad con descuento de 17 %");
return 17;	
	}
	
	
	
}
