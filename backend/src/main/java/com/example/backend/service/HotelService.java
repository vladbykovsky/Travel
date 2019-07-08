package com.example.backend.service;

import com.example.backend.entity.City;
import com.example.backend.entity.Food;
import com.example.backend.entity.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> findByCity(City city);
    List<Hotel> findAllByCityAndFood(City city, Food food);
    List<Hotel> findAllByLevel(String level);
    List<Hotel> findAllByCityAndLevel(City city, String level);
    Hotel saveHotel(Hotel hotel);

}
