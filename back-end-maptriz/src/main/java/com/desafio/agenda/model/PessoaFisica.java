package com.desafio.agenda.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PessoaFisica extends Contato {
    @Column(unique = true)
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getDocument() {
        return cpf;
    }

//    public String getCpf() {
//        return cpf;
//    }
}
