package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Pedido;
import org.serratec.backend.TrabalhoFinal.dto.PedidoRequestDTO;

public interface PedidoService {
	List<Pedido> pesquisarTodos();
	Optional<Pedido> pesquisarUm(Long idCliente);
	Pedido inserir(PedidoRequestDTO pedidoDTO);
	boolean idExiste(Long id);
	void remover(Long id);
}

