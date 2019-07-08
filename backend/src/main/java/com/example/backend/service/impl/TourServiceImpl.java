package com.example.backend.service.impl;

import com.example.backend.entity.Hotel;
import com.example.backend.entity.Tour;
import com.example.backend.repository.TourRepository;
import com.example.backend.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    public TourServiceImpl(TourRepository tourRepository){this.tourRepository = tourRepository;}

    @Override
    public Optional<Tour> findById(int id) {
        return tourRepository.findById(id);
    }

    @Override
    public List<Tour> getAllByTransport(String transport) {
        return tourRepository.getAllByTransport(transport);
    }

    @Override
    public List<Tour> getTourByHotelByIdHotel(Hotel hotel) {
        return tourRepository.getTourByHotelByIdHotel(hotel);
    }

    @Override
    public Tour saveTour(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public void deleteTour(int id) {
        tourRepository.deleteById(id);
    }
}
