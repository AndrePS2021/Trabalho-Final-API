package org.serratec.backend.TrabalhoFinal.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class PedidoItem {
	
	@EmbeddedId
	private PedidoItemPk pedidoItemPK;
	
	@Column(name = "qtd_Produto", nullable = false)
	@NotBlank(message = "qtd não pode ser nula")
	@Size(max = 10000, message = "qtd não pode ser maior que {max}")
	@Min(value =1, message = "qtd não pode ser menor que {value}")
	private int qtdProduto;
	
	public PedidoItemPk getPedidoItemPK() {
		return pedidoItemPK;
	}

	public void setPedidoItemPK(PedidoItemPk pedidoItemPK) {
		this.pedidoItemPK = pedidoItemPK;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

}