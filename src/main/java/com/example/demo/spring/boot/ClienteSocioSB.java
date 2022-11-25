package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class ClienteSocioSB extends ClienteSB{

	public  Integer decuentoAp() {
		System.out.println("Cliente socio con descuento de 10 %");
return 10;	
	}
	
}
