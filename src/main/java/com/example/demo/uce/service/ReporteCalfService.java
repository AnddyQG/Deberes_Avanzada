package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.ReporteCalf;
import com.example.demo.uce.repository.IReporteCalfRepo;

@Service
public class ReporteCalfService implements IReporteCalfService{
@Autowired
private IReporteCalfRepo calfRepo;

@Override
public void agregar(ReporteCalf calf) {
	// TODO Auto-generated method stub
	this.calfRepo.insertar(calf);
}

@Override
public void modificar(ReporteCalf calf) {
	// TODO Auto-generated method stub
	this.calfRepo.actualizar(calf);
}

@Override
public ReporteCalf buscar(Integer id) {
	// TODO Auto-generated method stub
	return this.calfRepo.buscar(id);
}

@Override
public void eliminar(Integer id) {
	// TODO Auto-generated method stub
	this.calfRepo.eliminar(id);
}

	
}
