package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Categoria;
import org.serratec.backend.TrabalhoFinal.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> pesquisarTodos() {
		return categoriaRepository.findAll();
	}

	@Override
	public Optional<Categoria> pesquisarUm(Long idCategoria) {
		return categoriaRepository.findById(idCategoria);
	}
	
	@Override
	public Categoria inserir(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Override
	public boolean idExiste(Long id) {
		return categoriaRepository.existsById(id);
	}

	@Override
	public void remover(Long id) {
		categoriaRepository.deleteById(id);
	}
	
}
