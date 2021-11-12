package org.serratec.backend.TrabalhoFinal.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.serratec.backend.TrabalhoFinal.domain.Categoria;

public class ProdutoRequestDTO {
	private String nomeProduto;
	private String decricaoProduto;
	private int quantidadeEstoque;
	private LocalDate dataFabricacao;
	private BigDecimal valorUnitario;
	private Categoria categoria;
	
	public ProdutoRequestDTO() {
	}
	
	public ProdutoRequestDTO(String nomeProduto, String decricaoProduto, int quantidadeEstoque,
			LocalDate dataFabricacao, BigDecimal valorUnitario, Categoria categoria) {
		super();
		this.nomeProduto = nomeProduto;
		this.decricaoProduto = decricaoProduto;
		this.quantidadeEstoque = quantidadeEstoque;
		this.dataFabricacao = dataFabricacao;
		this.valorUnitario = valorUnitario;
		this.categoria = categoria;
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
