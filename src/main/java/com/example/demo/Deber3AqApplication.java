package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.boot.ClienteSB;
import com.example.demo.spring.boot.ClienteSocioSB;
import com.example.demo.spring.boot.ConcesionarioSB;
import com.example.demo.spring.boot.VendedorSB;
import com.example.demo.spring.boot.VentaCocheSB;

@SpringBootApplication
public class Deber3AqApplication implements CommandLineRunner{

	@Autowired
	private ClienteSB clienteSB;
	
	@Autowired
	private ClienteSocioSB socioSB;
	 @Autowired
	private VentaCocheSB ventaSB;
	 @Autowired
		private VendedorSB venderSB;
	 @Autowired
		private ConcesionarioSB conSB;
	 
	
	public static void main(String[] args) {
		SpringApplication.run(Deber3AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("SPRING BOOT");
	System.out.println(socioSB);
		this.socioSB.setNombres("RAFAEL QUISILEMA");
		this.socioSB.setCedula("1711733665");
		this.conSB.setNombreConcesionario("GOTITAS DEL SABER");
		this.conSB.setTipoCoche("TOYOTA");
		this.venderSB.setIdentificadorVenta("44578");
		this.venderSB.setNombreVendedor("DON MEDIO METRO");
		this.ventaSB.setFechaCompra(LocalDateTime.of(2022, 12,2,8,30));
		
		
		ventaSB.vender(LocalDateTime.of(2022, 10,2,3,30), venderSB, socioSB, conSB);
		System.out.println(socioSB);
		
	}

}
