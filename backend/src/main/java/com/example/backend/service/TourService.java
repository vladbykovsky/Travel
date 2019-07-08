package com.example.backend.service;

import com.example.backend.entity.Hotel;
import com.example.backend.entity.Tour;

import java.util.List;
import java.util.Optional;

public interface TourService {

    Optional<Tour> findById(int id);
    List<Tour> getAllByTransport(String transport);
    List<Tour> getTourByHotelByIdHotel(Hotel hotel);
    Tour saveTour(Tour tour);
    void deleteTour(int id);

}
