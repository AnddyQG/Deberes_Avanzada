package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.ReporteCalf;

public interface IReporteCalfRepo {
	
	public void insertar(ReporteCalf calf);
	public void actualizar(ReporteCalf calf);
	public ReporteCalf buscar(Integer id);
	public void eliminar(Integer id);

}
