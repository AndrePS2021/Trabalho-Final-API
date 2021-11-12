package org.serratec.backend.TrabalhoFinal.dto;

import java.time.LocalDate;

public class ClienteRequestDTO {
	private String nomeCliente;
	private String emailCliente;
	private String cpfCliente;
	private LocalDate nascimentoCliente;
	
	public ClienteRequestDTO() {
	}

	public ClienteRequestDTO(String nomeCliente, String emailCliente, String cpfCliente, LocalDate nascimentoCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.cpfCliente = cpfCliente;
		this.nascimentoCliente = nascimentoCliente;
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

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public LocalDate getNascimentoCliente() {
		return nascimentoCliente;
	}

	public void setNascimentoCliente(LocalDate nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}
	
}
	