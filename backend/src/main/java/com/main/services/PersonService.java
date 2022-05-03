package com.main.services;

import com.main.models.DTO.LoginDTO;
import com.main.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public LoginDTO findToLogin(String email){
        var pessoa = personRepository.findByEmail(email);
        LoginDTO login = new LoginDTO();
        
        if(pessoa != null){
            login.setEmail(email);
            login.setSenha(pessoa.getPassword());
        }
        return login;
    }
}
