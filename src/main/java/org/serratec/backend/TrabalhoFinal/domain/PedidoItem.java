package org.serratec.backend.TrabalhoFinal.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class PedidoItem {
	
	@EmbeddedId
	private PedidoItemPK pedidoItemPK;
	
	
	@Column(name = "qtd_Produto", nullable = false)
	@NotBlank(message = "qtd não pode ser nula")
	@Size(max = 10000, message = "qtd não pode ser maior que {max}")
	@Min(value =1, message = "qtd não pode ser menor que {value}")
	private int qtdProduto;
	
	@Column(name = "valor_total", nullable = false)
	@NotBlank(message = "valor não pode ser nulo")
	@Min(value = 0, message = "valor não pode ser menor que {value}")
	private BigDecimal valorTotal;

	

	public Pedido getPedidoItemPK() {
		return pedidoItemPK;
	}

	public void setPedidoItemPK(Pedido pedidoItemPK) {
		this.pedidoItemPK = pedidoItemPK;
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
		this.valorTotal = this.getProduto().getValorUnitario().multiply(BigDecimal.valueOf(this.getQtdProduto()));
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
