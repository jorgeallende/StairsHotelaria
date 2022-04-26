package com.main.models;

import javax.persistence.Entity;

@Entity
public class Recepcionista extends Person{
    private long codigoRecepcionista;

    public long getCodigoRecepcionista() {
        return codigoRecepcionista;
    }

    public void setCodigoRecepcionista(long codigoRecepcionista) {
        this.codigoRecepcionista = codigoRecepcionista;
    }
}
