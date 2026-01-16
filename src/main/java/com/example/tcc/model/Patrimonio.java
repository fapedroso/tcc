package com.example.tcc.model;

import com.example.tcc.dto.DadosCadastroPatrimonio;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    public Patrimonio(DadosCadastroPatrimonio dados){
        this.descricao = dados.descricao();
        this.nome = dados.nome();
        this.estado = true;
    }
}
