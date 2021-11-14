package org.serratec.backend.TrabalhoFinal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.serratec.backend.TrabalhoFinal.domain.Produto;
import org.serratec.backend.TrabalhoFinal.repository.ProdutoRepository;
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
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    @ApiOperation(value = "Lista todos os produtos", notes = "Listagem de produtos")

        public List<Produto> listar() {
            return produtoRepository.findAll();

         }

     @GetMapping("/{id}")
     @ApiOperation(value = "Consultar produto por id", notes = "Consultar produto") 

         public ResponseEntity<Produto> pesquisar (@Valid @PathVariable Long id) {
             Optional<Produto> produto = produtoRepository.findById(id);
             if (produto.isPresent()) {
                 return ResponseEntity.ok(produto.get());

         }

         return ResponseEntity.notFound().build();

          }
     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
     @ApiOperation(value = "Inserir produto", notes = "Inserir produto")

         public Produto inserir(@Valid @RequestBody Produto produto) {
             return produtoRepository.save(produto);

          }

     @PutMapping("/{id}")
     @ApiOperation(value = "Atualizar produto por id", notes = "Atualizar produto por id")

         public ResponseEntity<Produto> atualizar(@PathVariable Long id, @Valid @RequestBody Produto produto) {
         if (!produtoRepository.existsById(id)) {
             return ResponseEntity.notFound().build();

         }

         produto.setIdProduto(id);
         produto = produtoRepository.save(produto);
         return ResponseEntity.ok(produto);

          }

     @DeleteMapping("/{id}")
     @ApiOperation(value = "Deletar produto por id", notes = "Deletar produto")

         public ResponseEntity<Void> remover (@Valid @PathVariable Long id) {
             if (!produtoRepository.existsById(id)) {
                 return ResponseEntity.notFound().build();

         }

         produtoRepository.deleteById(id);
         return ResponseEntity.noContent().build();

         }

}
