package com.example.demo;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Alumno;
import com.example.demo.uce.modelo.ReporteCalf;
import com.example.demo.uce.service.IAlumnoService;
import com.example.demo.uce.service.IReporteCalfService;


@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

@Autowired
private IAlumnoService alumnoService;
@Autowired
private IReporteCalfService calfService;
	

	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Alumno alumno=  new Alumno();
		alumno.setNombre("Lorena");
		alumno.setApellido("Palacios");
		alumno.setCedula("3050008402");
		
		Alumno alumnob=this.alumnoService.buscar(4);
		System.out.println(" El alumno buscado es " + alumnob.getNombre() + " "+ alumnob.getCedula());
		this.alumnoService.eliminar(2);
		this.alumnoService.agregar(alumno);
		
		ReporteCalf calf= new ReporteCalf();
		alumno.setCalf(calf);
		calf.setMateria("Quimica");
		calf.setNota(new BigDecimal(20));
		
		
		
		
		
		
		
		this.calfService.agregar(calf);

	


	

	
	
	
	}

}
