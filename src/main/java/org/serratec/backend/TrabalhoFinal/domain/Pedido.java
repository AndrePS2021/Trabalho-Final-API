package org.serratec.backend.TrabalhoFinal.domain;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long idPedido;
		
	@Column(name = "data_pedido", nullable = false)
	@NotBlank(message = "data não pode ser nula")
	private LocalDate dataPedido = LocalDate.now();
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido")
	Set<PedidoItem> pedidoItens;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<PedidoItem> getPedidoItens() {
		return pedidoItens;
	}

	public void setPedidoItens(Set<PedidoItem> pedidoItens) {
		this.pedidoItens = pedidoItens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, dataPedido, idPedido, pedidoItens);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(dataPedido, other.dataPedido)
				&& Objects.equals(idPedido, other.idPedido) && Objects.equals(pedidoItens, other.pedidoItens);
	}

}
