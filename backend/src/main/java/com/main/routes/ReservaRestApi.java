package com.main.routes;

import java.util.List;

import com.main.models.Reserva;
import com.main.services.ReservaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ReservaRestApi {
    
    @Autowired
    private ReservaService reservaService;

    @GetMapping("/reserva/{id}")
    public Reserva listReserva(@PathVariable(value="id") Long id){
        var reserva = reservaService.findById(id);
        return reserva;
    }

    @GetMapping("/reservas")
    public List<Reserva> getAllReservas(){
        var reservas = reservaService.findAllReservas();
        return reservas;
    }

    @PostMapping("/reserva/create")
    public Reserva createReserva(@RequestBody Reserva params){

        var reserva = reservaService.createReserva(params);

        return reserva;
    }
}
