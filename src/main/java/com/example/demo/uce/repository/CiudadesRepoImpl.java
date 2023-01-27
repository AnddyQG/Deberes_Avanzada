package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Ciudades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadesRepoImpl implements ICiudadesRepo{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Ciudades ciudades) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudades);
	}

	@Override
	public void actualizar(Ciudades ciudades) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudades);
	}

	@Override
	public Ciudades buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudades.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudades ciudades=this.buscar(id);
		this.entityManager.remove(ciudades);
	}

}
