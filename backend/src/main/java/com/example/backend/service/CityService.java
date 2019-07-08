package com.example.backend.service;

import com.example.backend.entity.City;

import java.util.List;

public interface CityService {

    List<City> findAll();
    City findByName(String name);
    List<City> getAllByCountryId(int id);
    City saveCity(City city);

}
