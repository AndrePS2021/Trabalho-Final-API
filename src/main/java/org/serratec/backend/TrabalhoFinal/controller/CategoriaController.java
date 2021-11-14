package org.serratec.backend.TrabalhoFinal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.serratec.backend.TrabalhoFinal.domain.Categoria;
import org.serratec.backend.TrabalhoFinal.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	@ApiOperation(value = "Consultar todas as categorias", notes = "Consultar categorias")
	public List<Categoria> listar() {
		return categoriaRepository.findAll();

	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Consultar categoria por id", notes = "Consultar categoria")
	public ResponseEntity<Categoria> buscar(@PathVariable Long id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		if (categoria.isPresent()) {
			return ResponseEntity.ok(categoria.get());

		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Inserir categoria", notes = "Inserir categoria")
	public Categoria inserir(@Valid @RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);

	}

	@PutMapping("/{id}")
	@ApiOperation(value = "Atualizar categoria pelo id", notes = "Atualizar categoria por id")
	public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @Valid @RequestBody Categoria categoria) {
		if (categoriaRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		categoria.setIdCategoria(id);
		categoria = categoriaRepository.save(categoria);
		return ResponseEntity.ok(categoria);

	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deletar categoria por id", notes = "Deletar categoria")
	public ResponseEntity<Void> remover(@Valid @PathVariable Long id) {
		if (!categoriaRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		categoriaRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}