package com.example.tcc.model;

import com.example.tcc.dto.DadosAtualizacaoPatrimonio;
import com.example.tcc.dto.DadosCadastroPatrimonio;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity(name = "Patrimonio")
@Table(name = "patrimonios")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of =  "id")
public class Patrimonio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;
    private Boolean estado;
    private Boolean ativo;

    public Patrimonio(DadosCadastroPatrimonio dados){
        this.descricao = dados.descricao();
        this.nome = dados.nome();
        this.estado = true;
        this.ativo = true;
    }

    public void atualizarPatrimonio(@Valid DadosAtualizacaoPatrimonio dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
