package com.main.models;

import javax.persistence.Entity;

import org.springframework.lang.NonNull;

@Entity
public class Gerente extends Person{
    @NonNull
    private long codigoGerente;

    public long getCodigoGerente() {
        return codigoGerente;
    }

    public void setCodigoGerente(int codigoGerente) {
        this.codigoGerente = codigoGerente;
    }
}
