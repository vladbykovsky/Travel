package com.example.backend.service.impl;

import com.example.backend.entity.City;
import com.example.backend.repository.CityRepository;
import com.example.backend.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository){this.cityRepository = cityRepository;}

    @Override
    public City findById(int id) {
        return cityRepository.findById(id);
    }
}
