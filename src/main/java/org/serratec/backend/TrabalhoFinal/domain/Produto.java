package org.serratec.backend.TrabalhoFinal.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long idProduto;
		
	@Column(name = "nome_produto", nullable = false)	
	@NotBlank(message = "nome do produto não pode ser nulo")
	@Size(max = 40)
	private String nomeProduto;
	
	@Column(name = "desricao_produto", nullable = false)
	@NotBlank(message = "descrição não pode ser nula")
	@Size(max = 100)
	private String decricaoProduto;
	
	@Column(name = "quantidade_estoque", nullable = false)
	@NotBlank(message = "quantidade não pode ser nula")
	@Min(value = 0, message = "quantidade minima é {value}")
	private int quantidadeEstoque = 0;
	
	@Column(name = "data_fabricacao", nullable = false)
	@NotBlank(message = "data não pode ser nula")
	private LocalDate dataFabricacao;
	
	@Column(name = "valor_unitario", nullable = false)
	@NotBlank(message = "valor não pode ser nulo")
	@Min(value = 0, message = "valor não pode ser menor que {value}")
	private BigDecimal valorUnitario;	
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", nullable = false)
	private Categoria categoria;

	

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDecricaoProduto() {
		return decricaoProduto;
	}

	public void setDecricaoProduto(String decricaoProduto) {
		this.decricaoProduto = decricaoProduto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

		
}
