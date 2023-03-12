package com.example.cars_base.repositories;

import com.example.cars_base.models.Modification;
import org.springframework.data.repository.CrudRepository;

public interface ModificationRepository extends CrudRepository<Modification,String> {
}
