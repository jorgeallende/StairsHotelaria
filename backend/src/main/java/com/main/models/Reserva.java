package com.main.models;


import java.sql.Date;


import javax.persistence.Entity;

@Entity
public class Reserva {
    private long id;
    private Quarto quartoReservado;
    private Cliente ocupante;
    private Recepcionista responsavel;
    private Date checkIn;
    private Date checkOut;


    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public Quarto getQuartoReservado() {
        return quartoReservado;
    }

    public void setQuartoReservado(Quarto quartoReservado) {
        this.quartoReservado = quartoReservado;
    }

    public Cliente getOcupante() {
        return ocupante;
    }

    public void setOcupante(Cliente ocupante) {
        this.ocupante = ocupante;
    }

    public Recepcionista getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Recepcionista responsavel) {
        this.responsavel = responsavel;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    
}
