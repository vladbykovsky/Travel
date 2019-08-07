package com.example.backend.controller;

import com.example.backend.entity.Hotel;
import com.example.backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Hotel getHotelById(@PathVariable(name = "id") int id){
        return hotelService.findByIdHotel(id);
    }
}
