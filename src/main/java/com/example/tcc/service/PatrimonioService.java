package com.example.tcc.service;

import com.example.tcc.dto.DadosCadastroPatrimonio;
import com.example.tcc.dto.DadosDetalhadosPatrimonio;
import com.example.tcc.model.Patrimonio;
import com.example.tcc.repository.PatrimonioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class PatrimonioService {

    @Autowired
    private PatrimonioRepository patrimonioRepository;

    public ResponseEntity cadastar(@Valid DadosCadastroPatrimonio dados, UriComponentsBuilder uriBuilder) {
        var patrimonio = new Patrimonio(dados);
        patrimonioRepository.save(patrimonio);

        var uri = uriBuilder.path("/patrimonios/{id}").buildAndExpand(patrimonio.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhadosPatrimonio(patrimonio));
    }
}
