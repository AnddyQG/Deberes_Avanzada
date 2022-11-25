package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class ClienteTerceraEdadSB extends ClienteSB{

	public Integer decuentoAp() {
		System.out.println("Cliente tercera edad con descuento de 11% %");
return 11;	
	}
	
	
}
