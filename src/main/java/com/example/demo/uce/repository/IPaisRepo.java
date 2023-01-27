package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Pais;

public interface IPaisRepo {

	public void insertar(Pais pais);
	public void actualizar(Pais pais);
	public Pais buscar(Integer id);
	public void eliminar(Integer id);
	
}
