package org.serratec.backend.TrabalhoFinal.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.serratec.backend.TrabalhoFinal.domain.Cliente;
import org.serratec.backend.TrabalhoFinal.repository.ClienteRepository;
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
@RequestMapping("/clientes")
public class ClienteController {

     @Autowired
     private ClienteRepository clienteRepository;


     @GetMapping
     @ApiOperation(value = "Consultar todos os clientes", notes = "Consultar clientes")

            public List<Cliente> listar() {
            return clienteRepository.findAll();

            }


     @GetMapping("/{id}")
     @ApiOperation(value = "Consultar cliente por id", notes = "Consultar cliente id")

            public ResponseEntity<Cliente> buscar (@Valid @PathVariable Long id) {
            Optional<Cliente> cliente = clienteRepository.findById(id);
            if (cliente.isPresent()) {
                return ResponseEntity.ok(cliente.get());
            }

            return ResponseEntity.notFound().build();

            }
@PostMapping
     @ResponseStatus(HttpStatus.CREATED)
     @ApiOperation(value = "Inserir um cliente", notes = "Inserir cliente")

            public Cliente inserir (@Valid @RequestBody Cliente cliente) {
            return clienteRepository.save(cliente);

            }


     @PutMapping("/{id}")
     @ApiOperation(value = "Atualizar cliente por id", notes = "Atualizar cliente por id")

            public ResponseEntity<Cliente> atualizar(@PathVariable Long idCliente, @Valid @RequestBody Cliente cliente) {
            if (clienteRepository.existsById(idCliente)) {
                return ResponseEntity.notFound().build();

            }

            cliente.setIdCliente(idCliente);
            cliente = clienteRepository.save(cliente);
            return ResponseEntity.ok(cliente);

            }


     @DeleteMapping("/{id}")
     @ApiOperation(value = "Deletar cliente por id", notes = "Deletar cliente")

            public ResponseEntity<Void> remover (@Valid @PathVariable Long id) {
            if (!clienteRepository.existsById(id)) {
                return ResponseEntity.notFound().build();

            }

            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();

            }
}
