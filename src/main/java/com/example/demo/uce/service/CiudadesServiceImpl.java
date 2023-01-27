package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudades;
import com.example.demo.uce.repository.ICiudadesRepo;

@Service
public class CiudadesServiceImpl implements ICiudadesService{

	@Autowired
	private ICiudadesRepo ciudadesRepo;

	@Override
	public void insertar(Ciudades ciudades) {
		// TODO Auto-generated method stub
		this.ciudadesRepo.insertar(ciudades);
	}

	@Override
	public void modificar(Ciudades ciudades) {
		// TODO Auto-generated method stub
		this.ciudadesRepo.actualizar(ciudades);
	}

	@Override
	public Ciudades buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadesRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadesRepo.eliminar(id);
	}
	
}
