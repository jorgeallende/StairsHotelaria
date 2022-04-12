package com.main.services;

import java.util.List;

import com.main.models.Cliente;
import com.main.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findById(long id){
        return clienteRepository.findById(id).orElseThrow();
    }

    public List<Cliente> findAllClientes(){
        List<Cliente> listCliente = (List<Cliente>) clienteRepository.findAll();
        return listCliente;
    }

    public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(long id){
        clienteRepository.deleteById(id);
    }

    public void deleteAllClientes(){
        clienteRepository.deleteAll();
    }

    public Cliente editCliente(Cliente cliente){
        Cliente clienteDb = findById(cliente.getId());

        clienteDb.setCodigoCliente((int)cliente.getCodigoCliente());
        clienteDb.setCpf(cliente.getCpf());
        clienteDb.setEmail(cliente.getEmail());
        clienteDb.setId(cliente.getId());
        clienteDb.setNacionalidade(cliente.getNacionalidade());
        clienteDb.setNascimento(cliente.getNascimento());
        clienteDb.setNome(cliente.getNome());
        clienteDb.setPassword(cliente.getPassword());
        clienteDb.setSexo(cliente.getSexo());
        clienteDb.setTelefone(cliente.getTelefone());

        clienteRepository.save(clienteDb);

        return clienteDb;
    }
}
