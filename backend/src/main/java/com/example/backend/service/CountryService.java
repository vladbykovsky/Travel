package com.example.backend.service;

import com.example.backend.entity.Country;

import java.util.List;

public interface CountryService {

    List<Country> findAll();
    Country findByName(String name);
    Country saveCountry(Country country);

}
