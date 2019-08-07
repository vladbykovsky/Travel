package com.example.backend.repository;

import com.example.backend.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

    //Country findById(int id);
    List<Country> findAll();
    Country findByName(String name);

}
