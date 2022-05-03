package com.main.routes;

import com.main.models.DTO.LoginDTO;
import com.main.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class PersonRestApi {
    
    @Autowired
    private PersonService personService;

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO params){
        try{
           var pessoa = personService.findToLogin(params.getEmail());
           if(pessoa == null)return "Esse login não existe no banco";

           if(pessoa != null && params.getEmail().equals(pessoa.getEmail()) && params.getSenha().equals(pessoa.getSenha())){
                return "Login Bem sucedido";
           }else{
               return "Senha incorreta";
           }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
