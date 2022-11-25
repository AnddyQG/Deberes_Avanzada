package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {

ClienteSocioH ch = new ClienteSocioH();
ch.setNombres("Anddy Quisilema");
ch.setCedula("1721483814");

VentaCocheH vch= new VentaCocheH();
vch.setFechaCompra(LocalDateTime.of(2022, 12,2,8,30));

 VendedorH vench= new VendedorH();
 vench.setNombreVendedor("Don Luis Xd");
 vench.setIdentificadorVenta("4567898972");
 ConcesionarioH conch = new ConcesionarioH();
 conch.setNombreConcesionario("CARROS DON POWER");
 conch.setTipoCoche("TOYOTA");
 
 vch.vender(LocalDateTime.of(2022, 12,2,8,30), vench, ch, conch);
		
	}

}
