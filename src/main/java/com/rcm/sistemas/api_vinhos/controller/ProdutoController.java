package com.rcm.sistemas.api_vinhos.controller;

import com.rcm.sistemas.api_vinhos.domain.dto.ProdutoCategoriaDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import com.rcm.sistemas.api_vinhos.service.CategoriaService;
import com.rcm.sistemas.api_vinhos.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> salvar(@RequestBody Produto produto) {
        Produto prod = produto;
        System.out.println(prod.getCategoria().getId());
        if (this.categoriaService.buscaCategoria(prod.getCategoria().getId())) {
            System.out.println("Categoria existe");
            return null;
        }
        System.out.println("Categoria não existe");
        return null;
    }
}
