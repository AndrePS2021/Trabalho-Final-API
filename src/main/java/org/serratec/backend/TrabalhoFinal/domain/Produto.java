package org.serratec.backend.TrabalhoFinal.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
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
	private Long id;
		
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		return Objects.hash(categoria, dataFabricacao, decricaoProduto, id, nomeProduto, quantidadeEstoque,
				valorUnitario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(dataFabricacao, other.dataFabricacao)
				&& Objects.equals(decricaoProduto, other.decricaoProduto) && Objects.equals(id, other.id)
				&& Objects.equals(nomeProduto, other.nomeProduto) && quantidadeEstoque == other.quantidadeEstoque
				&& Objects.equals(valorUnitario, other.valorUnitario);
	}

	
}
