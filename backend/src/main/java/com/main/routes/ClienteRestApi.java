package com.main.routes;

import java.util.List;

import com.main.models.Cliente;
import com.main.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ClienteRestApi {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{id}")
    public Cliente listCliente(@PathVariable(value="id") Long id){
        var cliente = clienteService.findById(id);
        return cliente;
    }

    @GetMapping("/clientes")
    public List<Cliente> getAllClientes(){
        var clientes = clienteService.findAllClientes();
        return clientes;
    }

    @PostMapping("/cliente/create")
    public Cliente createCliente(@RequestBody Cliente params){

        var cliente = clienteService.createCliente(params);

        return cliente;
    }
}
