package com.rcm.sistemas.api_vinhos.service;

import com.rcm.sistemas.api_vinhos.domain.dto.CategoriaProdutoDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import com.rcm.sistemas.api_vinhos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listAllProduto() {
        return this.produtoRepository.findAll();
    }

    public List<Produto> listAllProdutoDto() {
        return this.produtoRepository.produtoCategoria();
    }
}
