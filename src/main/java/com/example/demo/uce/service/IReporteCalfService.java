package com.example.demo.uce.service;

import com.example.demo.uce.modelo.ReporteCalf;

public interface IReporteCalfService {

	
	public void agregar(ReporteCalf calf);
	public void modificar(ReporteCalf calf);
	public ReporteCalf buscar(Integer id);
	public void eliminar(Integer id);
	
}
