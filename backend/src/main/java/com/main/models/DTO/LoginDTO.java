package com.main.models.DTO;
import java.io.Serializable;

public class LoginDTO implements Serializable{
    private String email;
    private String senha;
    
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
