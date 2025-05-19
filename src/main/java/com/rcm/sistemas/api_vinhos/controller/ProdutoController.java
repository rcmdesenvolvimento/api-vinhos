package com.rcm.sistemas.api_vinhos.controller;

import com.rcm.sistemas.api_vinhos.domain.dto.ProdutoCategoriaDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import com.rcm.sistemas.api_vinhos.service.CategoriaService;
import com.rcm.sistemas.api_vinhos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;
    private final CategoriaService categoriaService;

    public ProdutoController(ProdutoService produtoService, CategoriaService categoriaService) {
        this.produtoService = produtoService;
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listAllCategoria() {
        return ResponseEntity.ok(this.produtoService.listAllProduto());
    }

    @GetMapping("/ProdutoCategoria/{id}")
    public ResponseEntity<Optional<ProdutoCategoriaDto>> ProdutoById(@PathVariable Long id) {
        return ResponseEntity.ok(this.produtoService.ProdutoByID(id));
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        if (!this.categoriaService.buscaCategoria(produto.getCategoria().getId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(this.produtoService.salvar(produto));
    }
}
