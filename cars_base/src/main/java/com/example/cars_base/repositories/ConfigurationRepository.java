package com.example.cars_base.repositories;

import com.example.cars_base.models.Configuration;
import org.springframework.data.repository.CrudRepository;

public interface ConfigurationRepository extends CrudRepository<Configuration,String> {
}
