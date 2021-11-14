package org.serratec.backend.TrabalhoFinal.dto;

public class ClienteResponseDTO {
	private Long idCliente;
	private String nomeCliente;
	private String emailCliente;
	
	public ClienteResponseDTO() {
	}

	public ClienteResponseDTO(Long idCliente, String nomeCliente, String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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