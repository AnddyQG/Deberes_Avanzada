package com.example.demo.uce.modelo;

import java.math.BigDecimal;

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
@Table(name = "reportecalf")
@Entity
public class ReporteCalf {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "reca_seq")
	@SequenceGenerator(name = "reca_seq",sequenceName = "reca_seq",allocationSize = 1)
@Column(name = "reca_id")
	private Integer id;
@Column(name = "reca_materia")
	private String materia;
@Column(name = "reca_nota")
	private BigDecimal nota;
	
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "reca_id_alumno")

	private Alumno alumno;
	
	
	
	
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	//getters y setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public BigDecimal getNota() {
		return nota;
	}
	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}
	
	
	
	
}
