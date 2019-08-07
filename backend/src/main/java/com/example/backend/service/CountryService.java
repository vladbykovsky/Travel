package com.example.backend.service;

import com.example.backend.entity.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    Optional<Country> findById(int id);
    List<Country> findAll();
    Country findByName(String name);
    Country saveCountry(Country country);

}
