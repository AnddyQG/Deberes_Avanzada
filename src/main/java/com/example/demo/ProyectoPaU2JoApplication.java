package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudades;
import com.example.demo.uce.modelo.Pais;
import com.example.demo.uce.service.ICiudadesService;
import com.example.demo.uce.service.IPaisService;




@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IPaisService iPaisService;
	@Autowired
	private ICiudadesService ciudadesService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
		/*
		
		Pais pais= new Pais();
		pais.setNombre("Ecuador");
		pais.setContinente("America del Sur");
		pais.setHabitantes(new BigDecimal(178000000));
		this.iPaisService.insertar(pais);
		
		Ciudades ciudades= new Ciudades();
		ciudades.setNombre("Quito");
		ciudades.setPais(pais);
		this.ciudadesService.insertar(ciudades);
		
		Ciudades ciudades2= new Ciudades();
		ciudades2.setNombre("Guayaquil");
		ciudades2.setPais(pais);
		this.ciudadesService.insertar(ciudades2);
		
		Ciudades ciudades3= new Ciudades();
		ciudades3.setNombre("Cuenta");
		ciudades3.setPais(pais);
		this.ciudadesService.insertar(ciudades3);
		

*/
		Pais paisbuscar=this.iPaisService.buscar(1);
		System.out.println(paisbuscar.getNombre());
		paisbuscar.getCiudades().forEach(t-> System.out.println(t.getNombre() + " " + t.getId()));


//this.ciudadesService.eliminar(3);
	
//paisbuscar.getCiudades().forEach(t-> System.out.println(t.getNombre() + " " + t.getId()));
	
	
	
	}

}
