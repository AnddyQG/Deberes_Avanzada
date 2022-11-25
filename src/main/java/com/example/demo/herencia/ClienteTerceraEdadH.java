package com.example.demo.herencia;

import org.springframework.stereotype.Component;

@Component
public class ClienteTerceraEdadH extends ClienteH{

	protected Integer decuentoAp() {
		System.out.println("Cliente tercera edad con descuento de 11% %");
return 11;	
	}
	
	
}
