package org.serratec.backend.TrabalhoFinal.domain;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Long idCategoria;
	
	@Column(name = "nome_categoria", nullable = false, length = 50)
	@NotBlank(message = "nome não pode ser nulo")
	@Size (max = 50)
	private String nomeCategoria;

	@Column(name = "descricao_categoria", nullable = false, length = 200)
	@NotBlank(message = "descrição não pode ser nula")
	@Size(max = 200)
	private String descricaoCategoria;
	
	@OneToMany(mappedBy = "categoria")
	private List<Produto> produtos;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricaoCategoria, idCategoria, nomeCategoria, produtos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(descricaoCategoria, other.descricaoCategoria)
				&& Objects.equals(idCategoria, other.idCategoria) && Objects.equals(nomeCategoria, other.nomeCategoria)
				&& Objects.equals(produtos, other.produtos);
	}

	
}
