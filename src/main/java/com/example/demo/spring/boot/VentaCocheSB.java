package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class VentaCocheSB {

	private LocalDateTime fechaCompra;
	private ClienteSB cliente;
	private VendedorSB vendedor;
	private ConcesionarioSB concesionari;

	public void vender(  LocalDateTime fechaCompra, VendedorSB vch, ClienteSB ch,ConcesionarioSB conch ) {
		this.fechaCompra = LocalDateTime.now();
		
	
		Integer descuendo_val = ch.decuentoAp();
		System.out.println("Valor : " + descuendo_val);
		this.cliente=ch;
		this.concesionari=conch;
		this.vendedor=vch;
		this.GuardarVenta(this);
		
	}

	private void GuardarVenta(VentaCocheSB ventaCoche) {
		System.out.println("Guardando ventaa....");
		System.out.println(ventaCoche);
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public ClienteSB getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSB cliente) {
		this.cliente = cliente;
	}

	public VendedorSB getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorSB vendedor) {
		this.vendedor = vendedor;
	}

	public ConcesionarioSB getConcesionari() {
		return concesionari;
	}

	public void setConcesionari(ConcesionarioSB concesionari) {
		this.concesionari = concesionari;
	}

	@Override
	public String toString() {
		return "VentaCocheH [fechaCompra=" + fechaCompra + ", cliente=" + cliente + ", vendedor=" + vendedor
				+ ", concesionari=" + concesionari + "]";
	}

	
			

}
