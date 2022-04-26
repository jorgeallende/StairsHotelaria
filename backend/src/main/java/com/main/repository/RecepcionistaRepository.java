package com.main.repository;
import com.main.models.Recepcionista;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepcionistaRepository extends CrudRepository<Recepcionista,Long>{
    
}
