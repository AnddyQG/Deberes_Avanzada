package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Alumno;

public interface IAlumnoService {

	public void agregar(Alumno alumno);
	public void modificar(Alumno alumno);
	public Alumno buscar(Integer id);
	public void eliminar(Integer id);
	
}
