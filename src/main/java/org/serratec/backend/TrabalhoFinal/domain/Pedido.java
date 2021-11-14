package org.serratec.backend.TrabalhoFinal.domain;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@OneToMany(mappedBy = "pedidoItemPK.pedido", fetch = FetchType.EAGER)
	private Set<PedidoItem> pedidoItens = new HashSet<>();

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

	
}
