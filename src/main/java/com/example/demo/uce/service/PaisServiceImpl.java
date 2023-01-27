package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Pais;
import com.example.demo.uce.repository.IPaisRepo;

@Service
public class PaisServiceImpl implements IPaisService{

	
	@Autowired
	private IPaisRepo iPaisRepo;

	@Override
	public void insertar(Pais pais) {
		// TODO Auto-generated method stub
		this.iPaisRepo.insertar(pais);
	}

	@Override
	public void modificar(Pais pais) {
		// TODO Auto-generated method stub
		this.iPaisRepo.actualizar(pais);
	}

	@Override
	public Pais buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPaisRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPaisRepo.eliminar(id);
	}
	
}
