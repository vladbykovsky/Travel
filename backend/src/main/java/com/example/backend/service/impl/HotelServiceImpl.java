package com.example.backend.service.impl;

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
    public Hotel findByIdHotel(int id) {
        return hotelRepository.findByIdHotel(id);
    }

    @Override
    public List<Hotel> findAllByLevel(String level) {
        return hotelRepository.findAllByLevel(level);
    }

    @Override
    public List<Hotel> findAllByFoodId(int id) {
        return hotelRepository.findAllByFoodId(id);
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
