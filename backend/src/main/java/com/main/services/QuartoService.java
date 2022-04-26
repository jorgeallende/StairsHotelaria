package com.main.services;

import java.util.List;

import com.main.models.Quarto;
import com.main.repository.QuartoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuartoService {

    @Autowired
    private QuartoRepository quartoRepository;

    public Quarto findById(long id){
        return quartoRepository.findById(id).orElseThrow();
    }

    public List<Quarto> findAllQuartos(){
        List<Quarto> listaQuarto = (List<Quarto>) quartoRepository.findAll();
        return listaQuarto;
    }

    public Quarto createQuarto(Quarto cliente){
        return quartoRepository.save(cliente);
    }

    public void deleteQuarto(long id){
        quartoRepository.deleteById(id);
    }

    public void deleteAllQuarto(){
        quartoRepository.deleteAll();
    }

    public Quarto editQuarto(Quarto quarto){
        Quarto quartoDB;
        quartoDB = findById(quarto.getId());


        quartoDB.setCapacidadePessoas(quarto.getCapacidadePessoas());
        quartoDB.setLocal(quarto.getLocal());
        quartoDB.setId(quarto.getId());
        quartoDB.setTipoQuarto(quarto.getTipoQuarto());
        quartoRepository.save(quartoDB);

        return quartoDB;
    }
}


