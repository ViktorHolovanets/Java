package com.example.cars_base.repositories;

import com.example.cars_base.models.Model;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<Model,String> {
}
