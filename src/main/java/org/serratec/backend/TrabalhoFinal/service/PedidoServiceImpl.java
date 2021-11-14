package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Cliente;
import org.serratec.backend.TrabalhoFinal.domain.Pedido;
import org.serratec.backend.TrabalhoFinal.dto.PedidoRequestDTO;
import org.serratec.backend.TrabalhoFinal.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Override
	public List<Pedido> pesquisarTodos() {
		return pedidoRepository.findAll();
	}

	@Override
	public Optional<Pedido> pesquisarUm(Long idPedido) {
		return pedidoRepository.findById(idPedido);
	}
	
	@Override
	public Pedido inserir(PedidoRequestDTO pedidoRequestDTO) {
		Pedido pedido = new Pedido();
		Cliente cliente = new Cliente();
		cliente.setIdCliente(pedidoRequestDTO.getIdCliente());
		pedido.setCliente(cliente);
		//TODO: Preeencher os dados do pedido que vem da tela para inserir no banco. Obs. Fazer isso aqui ou criar outros médodos, a implemenação é com vocês
		
		return pedido;

	}

	@Override
	public boolean idExiste(Long id) {
		return pedidoRepository.existsById(id);
	}

	@Override
	public void remover(Long id) {
		pedidoRepository.deleteById(id);
	}
	
}

