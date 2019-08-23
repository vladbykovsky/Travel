package com.example.backend.service.impl;

import com.example.backend.entity.Hotel;
import com.example.backend.entity.Tour;
import com.example.backend.repository.TourRepository;
import com.example.backend.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Tour> getAllByTransport(String transport, Pageable pageable) {
        return tourRepository.getAllByTransport(transport, pageable);
    }

    @Override
    public List<Tour> getAllByHotelId(int id) {
        return tourRepository.getAllByHotelId(id);
    }

//    @Override
//    public List<Tour> getAllByCountryId(int id) {
//        return tourRepository.getAllByCountryId(id);
//    }


    @Override
    public Page<Tour> getAllByCountry_IdCountry(int id, Pageable pageable) {
        return tourRepository.getAllByCountry_IdCountry(id, pageable);
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
