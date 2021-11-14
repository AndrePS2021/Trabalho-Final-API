package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Endereco;



public interface EnderecoService {
	List<Endereco> pesquisarTodos();
	Optional<Endereco> pesquisarUm(Long idEndereco);
	Endereco inserir(Endereco endereco);
	boolean idExiste(Long id);
	void remover(Long id);

}
