package com.example.tcc.controller;

import com.example.tcc.dto.DadosAtualizacaoPatrimonio;
import com.example.tcc.dto.DadosCadastroPatrimonio;
import com.example.tcc.model.Patrimonio;
import com.example.tcc.service.PatrimonioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("patrimonios")
public class PatrimonioController {

    @Autowired
    private PatrimonioService patrimonioService;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroPatrimonio dados, UriComponentsBuilder uriBuilder) {
        return patrimonioService.cadastar(dados, uriBuilder);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoPatrimonio dados){
        return patrimonioService.atualizar(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id){
        return patrimonioService.deletar(id);
    }
}
