package org.serratec.backend.TrabalhoFinal.dto;

import java.math.BigDecimal;

public class PedidoItemResponseDTO {
	private long id;
	private int qteProduto;
	private BigDecimal valorTotal;
	
	public PedidoItemResponseDTO() {
	}

	public PedidoItemResponseDTO(long id, int qteProduto, BigDecimal valorTotal) {
		super();
		this.id = id;
		this.qteProduto = qteProduto;
		this.valorTotal = valorTotal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	