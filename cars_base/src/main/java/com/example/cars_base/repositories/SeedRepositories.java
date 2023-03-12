package com.example.cars_base.repositories;

import com.example.cars_base.models.Generation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface SeedRepositories extends CrudRepository<Generation, String> {

    @Modifying
    @Query(value = "INSERT INTO `mark`(id, name, `cyrillic-name`,`popular`,`country`) VALUES" +
            "(:#{#params[0]},:#{#params[1]},:#{#params[2]},:#{#params[3]},:#{#params[4]})",
            nativeQuery = true)
    @Transactional
    void seedMarks(String[] params);

    @Modifying
    @Query(value = "INSERT INTO `model`(id, name, `cyrillic-name`,class,`year-start`,`year-to`,`mark_id`) VALUES" +
            "(:#{#params[0]},:#{#params[1]},:#{#params[2]},:#{#params[3]},:#{#params[4]},:#{#params[5]},:#{#params[6]})",
            nativeQuery = true)
    @Transactional
    void seedModels(String[] params);
    @Modifying
    @Query(value = "INSERT INTO `generation` (id, name,`year-start`,`year-stop`,`is-restyle`,`model_id`) VALUES" +
            "(:#{#gen[0]},:#{#gen[1]},:#{#gen[2]},:#{#gen[3]},:#{#gen[4]},:#{#gen[5]})",
            nativeQuery = true)
    @Transactional
    void seedGeneration(String[] gen);
    @Modifying
    @Query(value = "INSERT INTO `configuration` (id, `doors-count`,`body-type`,`notice`,`generation_id`) VALUES" +
            "(:#{#gen[0]},:#{#gen[1]},:#{#gen[2]},:#{#gen[3]},:#{#gen[4]})",
            nativeQuery = true)
    @Transactional
    void seedConfiguration(String[] gen);
    @Modifying
    @Query(value = "INSERT INTO `modification` (`complectation_id`, `offers-price-from`,`offers-price-to`,`group-name`,`configuration_id`) VALUES" +
            "(:#{#params[0]},:#{#params[1]},:#{#params[2]},:#{#params[3]},:#{#params[4]})",
            nativeQuery = true)
    @Transactional
    void seedModification(String[] params);

}
