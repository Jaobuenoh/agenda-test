package com.desafio.agenda;

import com.desafio.agenda.model.PessoaFisica;
import com.desafio.agenda.validators.AtLeastOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgendaApplication.class, args);

        PessoaFisica pessoafisica = new PessoaFisica();


        if (pessoafisica.getClass().isAnnotationPresent(AtLeastOne.class)) {
            System.out.println("Works");
        } else
            System.out.println("Didn't work");
    }


}
