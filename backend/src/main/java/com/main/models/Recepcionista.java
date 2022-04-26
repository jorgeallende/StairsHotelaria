package com.main.models;

import javax.persistence.Entity;

import org.springframework.lang.NonNull;

@Entity
public class Recepcionista extends Person{
    @NonNull
    private long codigoRecepcionista;

    public long getCodigoRecepcionista() {
        return codigoRecepcionista;
    }

    public void setCodigoRecepcionista(long codigoRecepcionista) {
        this.codigoRecepcionista = codigoRecepcionista;
    }
}
