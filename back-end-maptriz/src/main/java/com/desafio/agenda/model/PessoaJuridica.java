package com.desafio.agenda.model;

import jakarta.persistence.Column;

public class PessoaJuridica extends Contato{

    @Column(unique = true, nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String razaoSocial;
    private String nomeFantasia;


}
