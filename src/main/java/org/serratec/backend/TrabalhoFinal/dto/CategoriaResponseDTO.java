package org.serratec.backend.TrabalhoFinal.dto;

import java.util.List;

import org.serratec.backend.TrabalhoFinal.domain.Produto;

public class CategoriaResponseDTO {

	private String nomeCategoria;
	private String descricaoCategoria;
	private List<Produto> produtos;
	
	public CategoriaResponseDTO() {
	}
	
	public CategoriaResponseDTO(String nomeCategoria, String descricaoCategoria, List<Produto> produtos) {
		super();
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria = descricaoCategoria;
		this.produtos = produtos;
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
