package com.rcm.sistemas.api_vinhos.service;

import com.rcm.sistemas.api_vinhos.domain.dto.ProdutoCategoriaDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import com.rcm.sistemas.api_vinhos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listAllProduto() {
        return this.produtoRepository.findAll();
    }

    public Optional<ProdutoCategoriaDto> ProdutoByID(Long id) {
        Optional<Produto> produto = this.produtoRepository.findById(id);
        ProdutoCategoriaDto dto = new ProdutoCategoriaDto(produto.get());
        return Optional.of(dto);
    }

    public Produto salvar(Produto produto) {
        return this.produtoRepository.save(produto);
    }
}
