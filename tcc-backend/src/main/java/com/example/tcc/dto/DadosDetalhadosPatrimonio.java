package com.example.tcc.dto;

import com.example.tcc.model.Patrimonio;

public record DadosDetalhadosPatrimonio(Long id, String nome, String descricao, Boolean estado) {
    public DadosDetalhadosPatrimonio(Patrimonio patrimonio){
        this(patrimonio.getId(),patrimonio.getNome(), patrimonio.getDescricao(), patrimonio.getEstado());
    }
}
