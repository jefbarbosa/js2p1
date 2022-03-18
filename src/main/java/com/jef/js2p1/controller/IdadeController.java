package com.jef.js2p1.controller;

import com.jef.js2p1.service.IdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcula-idade")
public class IdadeController {

    private final IdadeService idadeService;

    public IdadeController(@Autowired IdadeService idadeService) {
        this.idadeService = idadeService;
    }

    @GetMapping("/{dia}/{mes}/{ano}")
    public ResponseEntity<Long> calculaIdade(@PathVariable("dia") Integer dia,
                                                @PathVariable("mes") Integer mes,
                                                @PathVariable("ano") Integer ano) {

        return new ResponseEntity<>(idadeService.calculaIdade(dia, mes, ano), HttpStatus.OK);
    }
}
