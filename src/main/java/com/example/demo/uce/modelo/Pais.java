package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "pais")
public class Pais {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pais_seq")
@SequenceGenerator(name = "pais_seq",sequenceName = "pais_seq",allocationSize = 1)

@Column(name = "pais_id")
	private Integer id;
@Column(name = "pais_nombre")
	private String nombre;
@Column(name = "pais_continente")
	private String continente;
@Column(name = "pais_habitantes")
	private BigDecimal habitantes;

@OneToMany(mappedBy = "pais",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
private List<Ciudades> ciudades;

//getters and setters

public Integer getId() {
	return id;
}
public List<Ciudades> getCiudades() {
	return ciudades;
}
public void setCiudades(List<Ciudades> ciudades) {
	this.ciudades = ciudades;
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
public String getContinente() {
	return continente;
}
public void setContinente(String continente) {
	this.continente = continente;
}
public BigDecimal getHabitantes() {
	return habitantes;
}
public void setHabitantes(BigDecimal habitantes) {
	this.habitantes = habitantes;
}


	
}
