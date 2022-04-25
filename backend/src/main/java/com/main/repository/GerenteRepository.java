package com.main.repository;


import com.main.models.Gerente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRepository extends CrudRepository<Gerente,Long>{
    
}
