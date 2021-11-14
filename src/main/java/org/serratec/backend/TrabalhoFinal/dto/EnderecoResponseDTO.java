package org.serratec.backend.TrabalhoFinal.dto;

public class EnderecoResponseDTO {
	private Long idEndereco;
	private String cep;

	public EnderecoResponseDTO() {
	}

	public EnderecoResponseDTO(Long idEndereco, String cep) {
		super();
		this.idEndereco = idEndereco;
		this.cep = cep;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
