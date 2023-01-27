package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Pais;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PaisRepoImpl implements IPaisRepo{
@PersistenceContext
private EntityManager entityManager;
	@Override
	public void insertar(Pais pais) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pais);
	}

	@Override
	public void actualizar(Pais pais) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pais);
	}

	@Override
	public Pais buscar(Integer id) {
		// TODO Auto-generated method stub
		Pais pais=this.entityManager.find(Pais.class, id);
		pais.getCiudades().size();
		
		return pais;
	}

	@Override
	public void eliminar(Integer id) {
		Pais pais=this.buscar(id);
		this.entityManager.remove(pais);
		
	}

}
