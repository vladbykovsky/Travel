package com.example.backend.repository;

import com.example.backend.entity.Hotel;
import com.example.backend.entity.Tour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;

@Repository
public interface TourRepository extends CrudRepository<Tour, Integer> {

    List<Tour> getAllByTransport(String transport);
    List<Tour> getTourByHotelByIdHotel(Hotel hotel);

}
