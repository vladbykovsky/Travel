package com.example.backend.service.impl;

import com.example.backend.entity.City;
import com.example.backend.repository.CityRepository;
import com.example.backend.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository){this.cityRepository = cityRepository;}

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findByName(String name) {
        return cityRepository.findByName(name);
    }

    @Override
    public List<City> getAllByCountryId(int id) {
        return cityRepository.getAllByCountryId(id);
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }
}
