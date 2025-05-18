package com.rcm.sistemas.api_vinhos.modelmapper.Assembler;

import com.rcm.sistemas.api_vinhos.domain.dto.CategoriaDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Categoria;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoriaModelAssembler {

    private final ModelMapper modelMapper;

    public CategoriaModelAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CategoriaDto toModel(Categoria categoria) {
        return modelMapper.map(categoria, CategoriaDto.class);
    }

    public Categoria toDomain(CategoriaDto categoriaDto) {
        return modelMapper.map(categoriaDto, Categoria.class);
    }

    public List<CategoriaDto> toCollectionModel(List<Categoria> categorias) {
        return categorias.stream()
                .map(categoria -> toModel(categoria))
                .collect(Collectors.toList());
    }
}
