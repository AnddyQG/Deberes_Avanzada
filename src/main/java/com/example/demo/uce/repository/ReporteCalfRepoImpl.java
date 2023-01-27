package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.ReporteCalf;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class ReporteCalfRepoImpl implements IReporteCalfRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(ReporteCalf calf) {
		// TODO Auto-generated method stub
		this.entityManager.persist(calf);
	}

	@Override
	public void actualizar(ReporteCalf calf) {
		// TODO Auto-generated method stub
		this.entityManager.merge(calf);
	}

	@Override
	public ReporteCalf buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(ReporteCalf.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		ReporteCalf calf=this.buscar(id);
		this.entityManager.remove(calf);
	}

}
