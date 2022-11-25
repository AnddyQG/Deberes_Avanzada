package com.example.demo.herencia;

import org.springframework.stereotype.Component;

@Component
public class ConcesionarioH {
private String tipoCoche;
private String nombreConcesionario;
public String getTipoCoche() {
	return tipoCoche;
}
public void setTipoCoche(String tipoCoche) {
	this.tipoCoche = tipoCoche;
}
public String getNombreConcesionario() {
	return nombreConcesionario;
}
public void setNombreConcesionario(String nombreConcesionario) {
	this.nombreConcesionario = nombreConcesionario;
}

@Override
public String toString() {
	return "Concesionario [tipoCoche=" + tipoCoche + ", nombreConcesionario=" + nombreConcesionario + "]";
}


}
