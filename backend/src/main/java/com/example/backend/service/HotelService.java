package com.example.backend.service;

import com.example.backend.entity.Food;
import com.example.backend.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel findByIdHotel(int id);
    List<Hotel> findAllByLevel(String level);
    List<Hotel> findAllByFoodId(int id);
    Hotel saveHotel(Hotel hotel);

}
