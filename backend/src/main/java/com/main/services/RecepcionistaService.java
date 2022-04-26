package com.main.services;

import java.util.List;

import com.main.models.Recepcionista;
import com.main.repository.RecepcionistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecepcionistaService {

    @Autowired
    private RecepcionistaRepository recepcionistaRepository;

    public Recepcionista findById(long id){
        return recepcionistaRepository.findById(id).orElseThrow();
    }

    public List<Recepcionista> findAllRecepcionistas(){
        List<Recepcionista> listaRecepcionista = (List<Recepcionista>) recepcionistaRepository.findAll();
        return listaRecepcionista;
    }

    public Recepcionista createRecepcionista(Recepcionista cliente){
        return recepcionistaRepository.save(cliente);
    }

    public void deleteRecepcionista(long id){
        recepcionistaRepository.deleteById(id);
    }

    public void deleteAllRecepcionista(){
        recepcionistaRepository.deleteAll();
    }

    public Recepcionista editRecepcionista(Recepcionista recepcionista){
        Recepcionista recepcionistaDB;
        recepcionistaDB = findById(recepcionista.getCodigoRecepcionista());


        recepcionistaDB.setCodigoRecepcionista(recepcionista.getCodigoRecepcionista());
        recepcionistaDB.setCpf(recepcionista.getCpf());
        recepcionistaDB.setId(recepcionista.getId());
        recepcionistaDB.setEmail(recepcionista.getEmail());
        recepcionistaDB.setNascimento(recepcionista.getNascimento());
        recepcionistaDB.setNome(recepcionista.getNome());
        recepcionistaDB.setPassword(recepcionista.getPassword());
        recepcionistaDB.setSexo(recepcionista.getSexo());
        recepcionistaDB.setTelefone(recepcionista.getTelefone());
        recepcionistaRepository.save(recepcionistaDB);

        return recepcionistaDB;
    }
}


