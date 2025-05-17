package com.rcm.sistemas.api_vinhos.service;

import com.rcm.sistemas.api_vinhos.domain.dto.CategoriaProdutoDto;
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
        List<Produto> lst = this.produtoRepository.findAll();
        return this.produtoRepository.findAll();
    }

    public Optional<CategoriaProdutoDto> ProdutoByID(Long id) {
        Optional<Produto> produto = this.produtoRepository.findById(id);
        CategoriaProdutoDto dto = new CategoriaProdutoDto(produto.get());
        return Optional.of(dto);
    }


}
