package com.example.backend.service;

import com.example.backend.entity.Hotel;
import com.example.backend.entity.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TourService {

    Optional<Tour> findById(int id);
    Page<Tour> getAllByTransport(String transport, Pageable pageable);
    List<Tour> getAllByHotelId(int id);
    Page<Tour> getAllByCountry_IdCountry(int id, Pageable pageable);
    Tour saveTour(Tour tour);
    void deleteTour(int id);

}
