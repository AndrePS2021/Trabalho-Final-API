package org.serratec.backend.TrabalhoFinal.dto;

import java.time.LocalDate;

import org.serratec.backend.TrabalhoFinal.domain.Cliente;

public class PedidoRequestDTO {
	private LocalDate dataPedido;
	private Cliente cliente;
	
	public PedidoRequestDTO() {
	}
	
	public PedidoRequestDTO(LocalDate dataPedido, Cliente cliente) {
		super();
		this.dataPedido = dataPedido;
		this.cliente = cliente;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



}
