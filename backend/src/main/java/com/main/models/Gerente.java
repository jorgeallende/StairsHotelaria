package com.main.models;

import javax.persistence.Entity;

@Entity
public class Gerente extends Person{
    private long codigoGerente;

    public long getCodigoGerente() {
        return codigoGerente;
    }

    public void setCodigoGerente(int codigoGerente) {
        this.codigoGerente = codigoGerente;
    }
}
