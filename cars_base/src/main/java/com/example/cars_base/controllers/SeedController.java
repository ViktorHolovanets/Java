package com.example.cars_base.controllers;

import com.example.cars_base.lib.SeedDataBase;
import com.example.cars_base.repositories.SeedRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeedController {
    final SeedRepositories seed;

    public SeedController(SeedRepositories seed) {
        this.seed = seed;
    }

    @GetMapping("/test")
    public void getInfo() {
        SeedDataBase seedDataBase=new SeedDataBase();

        seedDataBase.insertDatabase("marks",(arg)->seed.seedMarks(arg));
        seedDataBase.insertDatabase("models",(arg)->seed.seedModels(arg));
        seedDataBase.insertDatabase("generations",(arg)->seed.seedGeneration(arg));
        seedDataBase.insertDatabase("configurations",(arg)->seed.seedConfiguration(arg));
        seedDataBase.insertDatabase("modifications",(arg)->seed.seedModification(arg));
    }
}
