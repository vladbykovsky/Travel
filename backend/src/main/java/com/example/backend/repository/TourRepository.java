package com.example.backend.repository;

import com.example.backend.entity.Country;
import com.example.backend.entity.Hotel;
import com.example.backend.entity.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;
import java.util.Optional;

@Repository
public interface TourRepository extends CrudRepository<Tour, Integer> {

    Page<Tour> getAllByTransport(String transport, Pageable pageable);
    List<Tour> getAllByHotelId(int id);
    Page<Tour> getAllByCountry_IdCountry(int id, Pageable pageable);



}
