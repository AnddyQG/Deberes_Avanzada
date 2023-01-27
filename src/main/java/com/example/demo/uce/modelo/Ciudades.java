package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudades {
	

	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ciu_seq")
	@SequenceGenerator(name = "ciu_seq",sequenceName = "ciu_seq",allocationSize = 1)
	@Id
@Column(name = "ciu_id")
	private Integer id;
@Column(name = "ciu_nombre")
	private String nombre;

@ManyToOne
@JoinColumn(name = "ciu_id_pais")
private Pais pais;



//getters and setters

public Pais getPais() {
	return pais;
}
public void setPais(Pais pais) {
	this.pais = pais;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
	
	
}
