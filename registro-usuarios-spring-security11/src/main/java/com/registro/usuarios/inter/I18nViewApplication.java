package com.registro.usuarios.inter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.registro.usuarios", "co.edu.usco.pw.i18n_view"})
public class I18nViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(I18nViewApplication.class, args);
    }
}