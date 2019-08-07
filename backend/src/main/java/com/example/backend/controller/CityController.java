package com.example.backend.controller;

import com.example.backend.entity.City;
import com.example.backend.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public City getCityById(@PathVariable(name = "id") int id){
        return cityService.findById(id);
    }


}
