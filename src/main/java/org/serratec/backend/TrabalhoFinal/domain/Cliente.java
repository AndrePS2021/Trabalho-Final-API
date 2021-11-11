package org.serratec.backend.TrabalhoFinal.domain;


import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long idCliente;

	@Column(name = "nome_cliente", nullable = false)
	@NotBlank(message = "nome não pode ser nulo")
	@Size(max = 50, message = "nome não pode ser maior que {max} caracteres")
	private String nomeCliente;
	
	@Email
	@Column(name = "email_cliente")
	private String emailCliente;
	
	@CPF
	@Column(name = "cpf_cliente", nullable = false)
	private String cpfCliente;
	
	@Column(name = "nascimento_cliente", nullable = false)
	@NotBlank(message = "data não pode ser nula")
	private LocalDate nascimentoCliente;

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

	@Override
	public int hashCode() {
		return Objects.hash(cpfCliente, emailCliente, idCliente, nascimentoCliente, nomeCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpfCliente, other.cpfCliente) && Objects.equals(emailCliente, other.emailCliente)
				&& Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(nascimentoCliente, other.nascimentoCliente)
				&& Objects.equals(nomeCliente, other.nomeCliente);
	}

	
}
