package com.desafio.agenda.model;

import jakarta.persistence.Column;

public class PessoaFisica extends Contato{
    @Column(unique = true, nullable = false)
    private String cpf;


}
