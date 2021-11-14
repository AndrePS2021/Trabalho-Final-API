package org.serratec.backend.TrabalhoFinal.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.TrabalhoFinal.domain.Endereco;
import org.serratec.backend.TrabalhoFinal.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Override
	public List<Endereco> pesquisarTodos() {
		return enderecoRepository.findAll();
	}

	@Override
	public Optional<Endereco> pesquisarUm(Long idEndereco) {
		return enderecoRepository.findById(idEndereco);
	}
	
	@Override
	public Endereco inserir(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	@Override
	public boolean idExiste(Long id) {
		return enderecoRepository.existsById(id);
	}

	@Override
	public void remover(Long id) {
		enderecoRepository.deleteById(id);
	}
	
}
