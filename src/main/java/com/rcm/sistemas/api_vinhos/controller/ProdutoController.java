package com.rcm.sistemas.api_vinhos.controller;

import com.rcm.sistemas.api_vinhos.domain.dto.CategoriaProdutoDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import com.rcm.sistemas.api_vinhos.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listAllCategoria() {
        return ResponseEntity.ok(this.produtoService.listAllProduto());
    }

    @GetMapping("/ProdutoCategoria/{id}")
    public ResponseEntity<Optional<CategoriaProdutoDto>> ProdutoById(@PathVariable Long id) {
        return ResponseEntity.ok(this.produtoService.ProdutoByID(id));
    }
}
