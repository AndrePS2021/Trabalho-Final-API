package org.serratec.backend.TrabalhoFinal.dto;

import org.serratec.backend.TrabalhoFinal.domain.Pedido;
import org.serratec.backend.TrabalhoFinal.domain.Produto;

public class PedidoItemPkRequestDTO {
	private Pedido pedido;
	private Produto produto;
	
	
	public PedidoItemPkRequestDTO() {
		super();
	}

	public PedidoItemPkRequestDTO(Pedido pedido, Produto produto) {
		super();
		this.pedido = pedido;
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}

