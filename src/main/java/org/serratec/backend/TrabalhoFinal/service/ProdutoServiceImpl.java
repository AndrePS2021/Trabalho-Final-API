package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Produto;
import org.serratec.backend.TrabalhoFinal.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> pesquisarTodos() {
		return produtoRepository.findAll();
	}

	@Override
	public Optional<Produto> pesquisarUm(Long idProduto) {
		return produtoRepository.findById(idProduto);
	}
	
	@Override
	public Produto inserir(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public boolean idExiste(Long id) {
		return produtoRepository.existsById(id);
	}

	@Override
	public void remover(Long id) {
		produtoRepository.deleteById(id);
	}
	
}

