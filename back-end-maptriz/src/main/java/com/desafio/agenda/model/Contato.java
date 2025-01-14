package com.desafio.agenda.model;

import jakarta.persistence.*;

import java.util.Date;

public abstract class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private Date dataCadastro;
    private Date dataAtualizacao;

    @PrePersist
    public void prePersist() {
        dataCadastro = new Date();
        dataAtualizacao = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        dataAtualizacao = new Date();
    }

}
