package com.example.backend.repository;

import com.example.backend.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

    List<Country> findAll();
    Country findByName(String name);

}
