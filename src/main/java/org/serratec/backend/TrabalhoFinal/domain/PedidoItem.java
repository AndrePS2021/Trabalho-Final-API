package org.serratec.backend.TrabalhoFinal.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
// import javax.persistence.OneToMany;// COMENTADO POR CAUSA DO ERRO
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class PedidoItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedidoItem")
	private Long idPedidoItem;
	
	@Column(name = "qtd_Produto", nullable = false)
	@NotBlank(message = "qtd não pode ser nula")
	@Size(max = 10000, message = "qtd não pode ser maior que {max}")
	@Min(value =1, message = "qtd não pode ser menor que {value}")
	private int qtdProduto;
	
	@Column(name = "valor_total", nullable = false)
	@NotBlank(message = "valor não pode ser nulo")
	@Min(value = 0, message = "valor não pode ser menor que {value}")
	private BigDecimal valorTotal;

	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;

	
	//SE DEIXA ESSA LIGAÇAO DA ERRO, NAO SEI COMO LIGAR NAS DUAS TABELA
//	@OneToMany
//	@JoinColumn(name = "id_produto")
//	private Produto produto;

	public Long getIdPedidoItem() {
		return idPedidoItem;
	}

	public void setIdPedidoItem(Long idPedidoItem) {
		this.idPedidoItem = idPedidoItem;
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

//	public void setValorTotal(BigDecimal valorTotal) {
//		this.valorTotal = this.getProduto().getValorUnitario().multiply(BigDecimal.valueOf(this.getQtdProduto()));
//	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	
	//PRECISO DESSE GETPRODUTO E DO SETPRODUTO PARA PODER CALCULAR O VALOR TOTAL MAS NAO CONSIGO
	//LIGAR AS TABELAS SEM O ONETOMANY COMENTADO ACIMA
//	public Produto getProduto() {
//		return produto;
//	}

//	public void setProduto(Produto produto) {
//		this.produto = produto;
//	}

}
