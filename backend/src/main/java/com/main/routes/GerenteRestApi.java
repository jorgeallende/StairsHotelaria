package com.main.routes;

import com.main.models.Gerente;
import com.main.services.GerenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class GerenteRestApi {
    @Autowired
    private GerenteService gerenteService;

    @GetMapping("/gerente/{id}")
    public Gerente listGerente(@PathVariable(value="id") Long id){
        var gerente = gerenteService.findById(id);
        return gerente;
    }

    @PostMapping("/gerente/create")
    public Gerente createGerente(@RequestBody Gerente params){

        var gerente = gerenteService.createGerente(params);

        return gerente;
    }
}
