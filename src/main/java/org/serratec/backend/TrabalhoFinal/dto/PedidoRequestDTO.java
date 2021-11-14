package org.serratec.backend.TrabalhoFinal.dto;

import java.util.ArrayList;
import java.util.List;

public class PedidoRequestDTO {
	private Long idPedido;
	private Long idCliente;
	private List<PedidoItemRequestDTO> itens = new ArrayList<>();
	
	public PedidoRequestDTO() {
	}

	public Long getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}


	public Long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}


	public List<PedidoItemRequestDTO> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItemRequestDTO> itens) {
		this.itens = itens;
	}
}
