package com.jef.js2p1.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class IdadeService {

    public long calculaIdade(Integer... args) {

        LocalDate localDate = LocalDate.of(args[0], args[1],args[2]);
        LocalDate now = LocalDate.now();

        return ChronoUnit.YEARS.between(localDate, now);
    }
}
