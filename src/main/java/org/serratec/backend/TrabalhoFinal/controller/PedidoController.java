package org.serratec.backend.TrabalhoFinal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.serratec.backend.TrabalhoFinal.domain.Pedido;
import org.serratec.backend.TrabalhoFinal.dto.PedidoRequestDTO;
import org.serratec.backend.TrabalhoFinal.service.PedidoService;
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
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService; 

	@GetMapping
	@ApiOperation(value = "Lista todos os pedidos", notes = "Listagem de pedidos")
	public List<Pedido> listar() {
		return pedidoService.pesquisarTodos();

	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Consultar pedido por id", notes = "Consultar pedido")
	public ResponseEntity<Pedido> pequisar(@Valid @PathVariable Long id) {
		Optional<Pedido> pedido = pedidoService.pesquisarUm(id);
		if (pedido.isPresent()) {
			return ResponseEntity.ok(pedido.get());

		}

		return ResponseEntity.notFound().build();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Inserir um pedido", notes = "Inserir pedido")
	public Pedido inserir(@Valid @RequestBody PedidoRequestDTO pedidoDTO) {
		return pedidoService.inserir(pedidoDTO);
	}

	@PutMapping("/{id}")
	@ApiOperation(value = "Atualizar pedido pelo id", notes = "Atualizar pedido pelo id")
	public ResponseEntity<Pedido> atualizar(@PathVariable Long idPedido, @Valid @RequestBody Pedido pedido) {
		if (!pedidoService.idExiste(idPedido)) {
			return ResponseEntity.notFound().build();

		}

		pedido.setIdPedido(idPedido);
		//pedido = pedidoService.inserir(pedido);
		return ResponseEntity.ok(pedido);

	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deletar pedido por id", notes = "Deletar pedido")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		if (!pedidoService.idExiste(id)) {
			return ResponseEntity.notFound().build();

		}

		pedidoService.remover(id);
		return ResponseEntity.noContent().build();
	}

}
