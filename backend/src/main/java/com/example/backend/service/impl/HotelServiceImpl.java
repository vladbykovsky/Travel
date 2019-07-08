package com.example.backend.service.impl;

import com.example.backend.entity.City;
import com.example.backend.entity.Food;
import com.example.backend.entity.Hotel;
import com.example.backend.repository.HotelRepository;
import com.example.backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository){this.hotelRepository = hotelRepository;}

    @Override
    public List<Hotel> findByCity(City city) {
        return hotelRepository.findByCity(city);
    }

    @Override
    public List<Hotel> findAllByCityAndFood(City city, Food food) {
        return hotelRepository.findAllByCityAndFood(city, food);
    }

    @Override
    public List<Hotel> findAllByLevel(String level) {
        return hotelRepository.findAllByLevel(level);
    }

    @Override
    public List<Hotel> findAllByCityAndLevel(City city, String level) {
        return hotelRepository.findAllByCityAndLevel(city, level);
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
