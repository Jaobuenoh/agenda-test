package com.desafio.agenda.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PessoaJuridica extends Contato {

    @Column(unique = true)
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    @Override
    public String getDocument() {
        return cnpj;
    }

//    public String getCnpj() {
//        return cnpj;
//    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

}
