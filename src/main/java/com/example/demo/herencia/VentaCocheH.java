package com.example.demo.herencia;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class VentaCocheH {

	private LocalDateTime fechaCompra;
	private ClienteH cliente;
	private VendedorH vendedor;
	private ConcesionarioH concesionari;

	public void vender(  LocalDateTime fechaCompra, VendedorH vch, ClienteH ch,ConcesionarioH conch ) {
		this.fechaCompra = LocalDateTime.now();
		
	
		Integer descuendo_val = ch.decuentoAp();
		System.out.println("Valor : " + descuendo_val);
		this.cliente=ch;
		this.concesionari=conch;
		this.vendedor=vch;
		this.GuardarVenta(this);
		
	}

	private void GuardarVenta(VentaCocheH ventaCoche) {
		System.out.println("Guardando ventaa....");
		System.out.println(ventaCoche);
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public ClienteH getCliente() {
		return cliente;
	}

	public void setCliente(ClienteH cliente) {
		this.cliente = cliente;
	}

	public VendedorH getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorH vendedor) {
		this.vendedor = vendedor;
	}

	public ConcesionarioH getConcesionari() {
		return concesionari;
	}

	public void setConcesionari(ConcesionarioH concesionari) {
		this.concesionari = concesionari;
	}

	@Override
	public String toString() {
		return "VentaCocheH [fechaCompra=" + fechaCompra + ", cliente=" + cliente + ", vendedor=" + vendedor
				+ ", concesionari=" + concesionari + "]";
	}

	
			

}
