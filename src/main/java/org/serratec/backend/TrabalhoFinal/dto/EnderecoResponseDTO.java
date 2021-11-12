package org.serratec.backend.TrabalhoFinal.dto;

public class EnderecoResponseDTO {

	private String cep;

	public EnderecoResponseDTO() {
	}
	
	public EnderecoResponseDTO(String cep) {
		super();
		this.cep = cep;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
