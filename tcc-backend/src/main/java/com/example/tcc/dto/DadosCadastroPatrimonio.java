package com.example.tcc.dto;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroPatrimonio (@NotNull String nome, @NotNull String descricao) {
}
