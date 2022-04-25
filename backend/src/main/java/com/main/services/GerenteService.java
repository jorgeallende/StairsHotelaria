package com.main.services;

import com.main.models.Gerente;
import com.main.repository.GerenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerenteService {

    @Autowired
    private GerenteRepository gerenteRepository;

    public Gerente findById(long id){
        return gerenteRepository.findById(id).orElseThrow();
    }

    public Gerente createGerente(Gerente cliente){
        return gerenteRepository.save(cliente);
    }

    public void deleteGerente(long id){
        gerenteRepository.deleteById(id);
    }

    public void deleteAllGerente(){
        gerenteRepository.deleteAll();
    }

    public Gerente editGerente(Gerente gerente){
        Gerente gerenteDB = findById(gerente.getId());


        gerenteDB.setCpf(gerente.getCpf());
        gerenteDB.setEmail(gerente.getEmail());
        gerenteDB.setId(gerente.getId());
        gerenteDB.setNascimento(gerente.getNascimento());
        gerenteDB.setNome(gerente.getNome());
        gerenteDB.setPassword(gerente.getPassword());
        gerenteDB.setSexo(gerente.getSexo());
        gerenteDB.setTelefone(gerente.getTelefone());
        gerenteRepository.save(gerenteDB);

        return gerenteDB;
    }
}


