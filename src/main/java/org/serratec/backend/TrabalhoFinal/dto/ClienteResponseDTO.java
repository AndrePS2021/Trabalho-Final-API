package org.serratec.backend.TrabalhoFinal.dto;

public class ClienteResponseDTO {
	private String nomeCliente;
	private String emailCliente;
	
	public ClienteResponseDTO() {
	}
	
	public ClienteResponseDTO(String nomeCliente, String emailCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	

}
