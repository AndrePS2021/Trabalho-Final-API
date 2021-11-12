package org.serratec.backend.TrabalhoFinal.dto;

import java.math.BigDecimal;

import org.serratec.backend.TrabalhoFinal.domain.Pedido;

public class PedidoItemRequestDTO {
	private int qtdProduto;
	private BigDecimal valorTotal;
	private Pedido pedido;
	
	public PedidoItemRequestDTO() {
	}
	
	public PedidoItemRequestDTO(int qtdProduto, BigDecimal valorTotal, Pedido pedido) {
		super();
		this.qtdProduto = qtdProduto;
		this.valorTotal = valorTotal;
		this.pedido = pedido;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	

}
