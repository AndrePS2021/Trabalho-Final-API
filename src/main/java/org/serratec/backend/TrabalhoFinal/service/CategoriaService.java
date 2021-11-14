package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Categoria;

public interface CategoriaService {

	List<Categoria> pesquisarTodos();
	Optional<Categoria> pesquisarUm(Long idCliente);
	Categoria inserir(Categoria categoria);
	boolean idExiste(Long id);
	void remover(Long id);
}