package com.example.demo.herencia;

import org.springframework.stereotype.Component;

@Component
public class ClienteSocioH extends ClienteH{

	protected Integer decuentoAp() {
		System.out.println("Cliente socio con descuento de 10 %");
return 10;	
	}
	
}
