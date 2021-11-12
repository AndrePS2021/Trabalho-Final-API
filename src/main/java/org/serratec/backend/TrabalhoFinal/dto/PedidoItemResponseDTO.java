package org.serratec.backend.TrabalhoFinal.dto;

import java.math.BigDecimal;

public class PedidoItemResponseDTO {
	private int qteProduto;
	private BigDecimal valorTotal;
	
	public PedidoItemResponseDTO() {
	}

	public PedidoItemResponseDTO(int qteProduto, BigDecimal valorTotal) {
		super();
		this.qteProduto = qteProduto;
		this.valorTotal = valorTotal;
	}

	public int getQteProduto() {
		return qteProduto;
	}

	public void setQteProduto(int qteProduto) {
		this.qteProduto = qteProduto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
