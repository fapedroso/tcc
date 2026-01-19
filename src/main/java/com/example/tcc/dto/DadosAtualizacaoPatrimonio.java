package com.example.tcc.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPatrimonio(@NotNull Long id, String nome, String descricao, Boolean estado) {
}
