package com.main.models;

import org.springframework.lang.NonNull;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

    @Id
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String cpf;

    @NonNull
    private String email;

    @NonNull
    private String telefone;
    private Date nascimento;
    private String sexo;
    private String password;

    public Long getId() {
        return id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getNome() {
        return nome;
    }

    public void setNome(@NonNull String nome) {
        this.nome = nome;
    }
}
