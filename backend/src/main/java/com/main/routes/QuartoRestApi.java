package com.main.routes;

import java.util.List;

import com.main.models.Quarto;
import com.main.services.QuartoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class QuartoRestApi {
    @Autowired
    private QuartoService quartoService;

    @GetMapping("/quarto/{id}")
    public Quarto listQuarto(@PathVariable(value="id") Long id){
        var quarto = quartoService.findById(id);
        return quarto;
    }

    @GetMapping("/quartos")
    public List<Quarto> getAllQuartos(){
        var quartos = quartoService.findAllQuartos();
        return quartos;
    }

    @PostMapping("/quarto/create")
    public Quarto createQuarto(@RequestBody Quarto params){

        var quarto = quartoService.createQuarto(params);

        return quarto;
    }
}
