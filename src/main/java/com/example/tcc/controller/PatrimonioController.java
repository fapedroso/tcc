package com.example.tcc.controller;

import com.example.tcc.dto.DadosCadastroPatrimonio;
import com.example.tcc.service.PatrimonioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
