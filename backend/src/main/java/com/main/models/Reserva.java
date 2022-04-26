package com.main.models;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Reserva {

    @Id
    private long id;
    @NonNull
    private Long idQuartoReservado;
    @NonNull
    private Long idOcupante;
    @NonNull
    private Long idResponsavel;
    @NonNull
    private Date checkIn;
    @NonNull
    private Date checkOut;


    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public Long getQuartoReservado() {
        return idQuartoReservado;
    }

    public void setQuartoReservado(Long quartoReservado) {
        this.idQuartoReservado = quartoReservado;
    }

    public Long getOcupante() {
        return idOcupante;
    }

    public void setOcupante(Long ocupante) {
        this.idOcupante = ocupante;
    }

    public Long getResponsavel() {
        return idResponsavel;
    }

    public void setResponsavel(Long responsavel) {
        this.idResponsavel = responsavel;
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
