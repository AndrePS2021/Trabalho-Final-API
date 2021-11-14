package org.serratec.backend.TrabalhoFinal.service;
import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Cliente;


public interface ClienteService {

	List<Cliente> pesquisarTodos();
	Optional<Cliente> pesquisarUm(Long idCliente);
	Cliente inserir(Cliente cliente);
	boolean idExiste(Long id);
	void remover(Long id);
}
