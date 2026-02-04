package com.example.tcc.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPatrimonio (@NotBlank String nome, @NotBlank String descricao) {
}

