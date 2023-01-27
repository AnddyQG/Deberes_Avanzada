package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Ciudades;

public interface ICiudadesRepo {
public void insertar(Ciudades ciudades);
public void actualizar(Ciudades ciudades);
public Ciudades buscar(Integer id);
public void eliminar(Integer id);
	
}
