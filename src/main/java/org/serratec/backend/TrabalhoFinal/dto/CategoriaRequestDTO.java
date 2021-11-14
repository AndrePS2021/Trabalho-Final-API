package org.serratec.backend.TrabalhoFinal.dto;

import java.util.List;

import org.serratec.backend.TrabalhoFinal.domain.Produto;

public class CategoriaRequestDTO {
	private Long idCategoria;
	private String nomeCategoria;
	private String descricaoCategoria;
	private List<Produto> produtos;
	
	public CategoriaRequestDTO() {
	}

	public CategoriaRequestDTO(Long idCategoria, String nomeCategoria, String descricaoCategoria,
			List<Produto> produtos) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria = descricaoCategoria;
		this.produtos = produtos;
	}

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
}
	