package com.main.models;

import javax.persistence.Entity;

import org.springframework.lang.NonNull;

@Entity
public class Cliente extends Person {

    @NonNull
    private long codigoCliente;
    @NonNull
    private String nacionalidade;
    

    public long getCodigoCliente() {
        return codigoCliente;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
