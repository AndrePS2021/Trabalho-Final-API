package org.serratec.backend.TrabalhoFinal.dto;

public class PedidoItemRequestDTO {
	
	private long idProduto;
	private int qtdProduto;
	
	public PedidoItemRequestDTO() {
	}

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
}
	
	