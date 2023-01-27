package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudades;

public interface ICiudadesService {

	public void insertar(Ciudades ciudades);
	public void modificar(Ciudades ciudades);
	public Ciudades buscar(Integer id);
	public void eliminar(Integer id);
	
	
}
