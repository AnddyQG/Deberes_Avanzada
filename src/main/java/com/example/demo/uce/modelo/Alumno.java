package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Table(name = "alumno")
@Entity
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "alu_seq")
	@SequenceGenerator(name = "alu_seq",sequenceName = "alu_seq",allocationSize = 1)
	@Column(name = "alu_id")
	private Integer id;
	@Column(name = "alu_nombre")
	private String nombre;
	@Column(name = "alu_apellido")
	private String apellido;
	@Column(name = "alu_cedula")
	private String cedula;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "alu_id_reportecalf")
	
	private ReporteCalf calf;
	
	
	
	public ReporteCalf getCalf() {
		return calf;
	}
	public void setCalf(ReporteCalf calf) {
		this.calf = calf;
	}
	//getters y setters
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
	
	
	
}
