package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private IHabitacionService habitacionService;
	@Autowired
	private IHotelService hotelService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*
		Estudiante estu= new Estudiante();
		//estu.setId(1);
		estu.setNombre("Anddy");
		estu.setApellido("Quisilema");
		estu.setCedula("1721483814");
		estu.setCiudad("Guayaquil");
		estu.setGenero("Masculino");
		
	
		estu.setCedula("09854321");
		
	
		this.estudianteService.agregar(estu);
		Estudiante estub= this.estudianteService.buscar(1);
		System.out.println("Cedula del estudiante buscado "+estub.getCedula());
		System.out.println("-----------------");
		Ciudadano ciu= new Ciudadano();
		
		System.out.println("------------------");
		//empleado
		
		Empleado empl= new Empleado();
		empl.setCiudadano(ciu);
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		this.empleadoService.agregar(empl);
		Empleado empleadob=  this.empleadoService.buscar(1);
	System.out.println("Salario del empleado buscado " + empleadob.getSalario());
	
		
		
		
		//ciudadano
		
		ciu.setNombre("Anddy");
		ciu.setApellido("Quisilema");
		ciu.setEmpleado(empl);
		this.ciudadanoService.agregar(ciu);
		System.out.println("Actualizando el nombre del ciudadano 1");
		ciu.setNombre("Rafael");
		this.ciudadanoService.modificar(ciu);
		Ciudadano ciudadanob=this.ciudadanoService.buscar(1);
		System.out.println("Apellido del ciudadano buscado "+ciudadanob.getApellido());
		System.out.println("Nuevo ciudadano");
		
		Ciudadano ciu2= new Ciudadano();
		ciu2.setNombre("Eddy");
		ciu2.setApellido("Guacollante");
		this.ciudadanoService.agregar(ciu2);
		*/
		/*
		//segundo ejemplo
		Ciudadano ciudadanoejemplo= new Ciudadano();
		Empleado empleadoejemplo= new Empleado();
		BigDecimal salarioempl=new BigDecimal(200);
		ciudadanoejemplo.setNombre("J");
		ciudadanoejemplo.setApellido("P");
		empleadoejemplo.setFechaIngreso(LocalDateTime.now());
		empleadoejemplo.setSalario(salarioempl);
		empleadoejemplo.setCiudadano(ciudadanoejemplo);
		ciudadanoejemplo.setEmpleado(empleadoejemplo);
		this.empleadoService.agregar(empleadoejemplo);
		
	*/
		
		
		
		
		
		
	Habitacion habitacion= new Habitacion();
	Habitacion habitacion2= new Habitacion();
	Habitacion habitacion3= new Habitacion();
	Hotel hotel= new Hotel();
	
	List<Habitacion> habitaciones= new ArrayList<>();
	
	/*
	hotel.setNombre("Hotel Palacios");
	hotel.setDireccion("Bellavista Calderon");
	this.hotelService.insertar(hotel);
	habitacion.setNumero("1254A");
	habitacion2.setNumero("1721BE");
	habitacion3.setNumero("0707JP");
	
	
	
	

	
habitaciones.add(habitacion);
	

	
	
	//ingreso hotel 1
	
	hotel.setHabitaciones(habitaciones);
	
	this.habitacionService.insertar(habitacion);
	
	habitacion.setHotel(hotel);
	
	this.hotelService.modificar(hotel);
	
	//ingresar hotel 2
	
	habitaciones.add(habitacion2);
	hotel.setHabitaciones(habitaciones);
	this.habitacionService.insertar(habitacion2);
	habitacion2.setHotel(hotel);
	this.hotelService.modificar(hotel);
	
	//ingreso hotel 3
	habitaciones.add(habitacion3);
	hotel.setHabitaciones(habitaciones);
	this.habitacionService.insertar(habitacion3);
	habitacion3.setHotel(hotel);
	this.hotelService.modificar(hotel);
	
	
	
	Habitacion habitacionimp=this.habitacionService.buscar(75);
	System.out.println(habitacionimp.getId());
	 //hotel 2
	Hotel hotel2= new Hotel();
	
	hotel2.setNombre("Hotel QG");
	hotel2.setDireccion("Calderon");
this.hotelService.insertar(hotel2);
*/

	
	System.out.println("Actualizamos la direccion del hotel 1");
	hotel.setDireccion("Quito Ecuador");
	this.hotelService.modificar(hotel);
	Hotel hotel3= this.hotelService.buscar(45);
	System.out.println(hotel3.getNombre());
	
	System.out.println("Eliminar el hotel 2");
	this.hotelService.eliminar(45);
	
	
	
	}

}
