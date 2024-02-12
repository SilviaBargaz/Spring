package com.certidevs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
// imprimir en los logs lo que ocurre en la aplicación especialmente lo que ocurre en la log, para revidsar
// que ocurre cuando la app esta en marcha en producción.


@RestController
public class pruebaLogcontroller {

    @GetMapping("prueba")
    public String prueba() {

        log.info("log nivel info");
        log.info("log nivel warning");

        Integer numero = 2;
        //para poder trabajar en la creacion de objeto integer es un envoltorio int
                log.error("el numero obtenido es incoreccto {}", numero);

        return "prueba";

    }

}
