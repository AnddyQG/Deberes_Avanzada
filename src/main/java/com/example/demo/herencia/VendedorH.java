package com.example.demo.herencia;

import org.springframework.stereotype.Component;

@Component
public class VendedorH {
private String NombreVendedor;
private String IdentificadorVenta;
public String getNombreVendedor() {
	return NombreVendedor;
}
public void setNombreVendedor(String nombreVendedor) {
	NombreVendedor = nombreVendedor;
}
public String getIdentificadorVenta() {
	return IdentificadorVenta;
}
public void setIdentificadorVenta(String identificadorVenta) {
	IdentificadorVenta = identificadorVenta;
}
@Override
public String toString() {
	return "Vendedor [NombreVendedor=" + NombreVendedor + ", IdentificadorVenta=" + IdentificadorVenta + "]";
}



}
