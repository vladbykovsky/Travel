package com.example.backend.controller;

import com.example.backend.entity.Country;
import com.example.backend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Country> getAllCountry(){
        return countryService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Country> getCountryById(@PathVariable(name = "id") Integer id){
        Optional<Country> country = countryService.findById(id);
        if (country.isPresent()){
            return ResponseEntity.ok(country.get());
        }else {
            return  ResponseEntity.notFound().build();
        }
    }

}
