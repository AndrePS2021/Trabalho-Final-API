package org.serratec.backend.TrabalhoFinal.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.serratec.backend.TrabalhoFinal.domain.Cliente;

public class PedidoResponseDTO {
	
	private List<PedidoItemRequestDTO> itens = new ArrayList<>();
	private LocalDate dataPedido;
	private Cliente cliente;
	
	public PedidoResponseDTO() {
	}
	
	public PedidoResponseDTO(LocalDate dataPedido, Cliente cliente) {
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
	
	public List<PedidoItemRequestDTO> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItemRequestDTO> itens) {
		this.itens = itens;
	}
}


