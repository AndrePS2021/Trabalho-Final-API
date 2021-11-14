package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Produto;


public interface ProdutoService {
	List<Produto> pesquisarTodos();
	Optional<Produto> pesquisarUm(Long id_Produto);
	Produto inserir(Produto produto);
	boolean idExiste(Long id);
	void remover(Long id);
}
