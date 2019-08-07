package com.example.backend.service.impl;

import com.example.backend.entity.Country;
import com.example.backend.repository.CountryRepository;
import com.example.backend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository){this.countryRepository = countryRepository;}

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country findByName(String name) {
        return countryRepository.findByName(name);
    }

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

}
