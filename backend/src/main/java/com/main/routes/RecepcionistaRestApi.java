package com.main.routes;

import java.util.List;

import com.main.models.Recepcionista;
import com.main.services.RecepcionistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RecepcionistaRestApi {
    @Autowired
    private RecepcionistaService recepcionistaService;

    @GetMapping("/recepcionista/{id}")
    public Recepcionista listRecepcionista(@PathVariable(value="id") Long id){
        var recepcionista = recepcionistaService.findById(id);
        return recepcionista;
    }

    @GetMapping("/recepcionistas")
    public List<Recepcionista> getAllRecepcionistas(){
        var recepcionistas = recepcionistaService.findAllRecepcionistas();
        return recepcionistas;
    }

    @PostMapping("/recepcionista/create")
    public Recepcionista createRecepcionista(@RequestBody Recepcionista params){

        var recepcionista = recepcionistaService.createRecepcionista(params);

        return recepcionista;
    }
}
