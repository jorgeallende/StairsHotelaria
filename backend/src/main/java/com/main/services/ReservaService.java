package com.main.services;

import java.util.List;

import com.main.models.Reserva;
import com.main.repository.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva findById(long id){
        return reservaRepository.findById(id).orElseThrow();
    }

    public List<Reserva> findAllReservas(){
        List<Reserva> listaReserva = (List<Reserva>) reservaRepository.findAll();
        return listaReserva;
    }

    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public void deleteReserva(long id){
        reservaRepository.deleteById(id);
    }

    public void deleteAllReserva(){
        reservaRepository.deleteAll();
    }

    public Reserva editReserva(Reserva reserva){
        Reserva reservaBD;
        reservaBD = findById(reserva.getid());


        reservaBD.setCheckIn(reserva.getCheckIn());
        reservaBD.setid(reserva.getid());
        reservaBD.setCheckOut(reserva.getCheckOut());
        reservaBD.setOcupante(reserva.getOcupante());
        reservaBD.setQuartoReservado(reserva.getQuartoReservado());
        reservaBD.setResponsavel(reserva.getResponsavel());
        reservaRepository.save(reservaBD);

        return reservaBD;
    }
}


