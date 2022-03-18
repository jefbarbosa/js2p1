package com.jef.js2p1.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class IdadeService {

    private Integer converteCampos(String campo) {
        return Integer.parseInt(campo);
    }

    public long calculaIdade(String... args) {
        int dia = converteCampos(args[0]);
        int mes = converteCampos(args[1]);
        int ano = converteCampos(args[2]);

        LocalDate localDate = LocalDate.of(ano, mes, dia);
        LocalDate now = LocalDate.now();

        return ChronoUnit.YEARS.between(localDate, now);
    }
}
