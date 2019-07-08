package com.example.backend.repository;

import com.example.backend.entity.City;
import com.example.backend.entity.Food;
import com.example.backend.entity.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Level;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Integer> {

    List<Hotel> findByCity(City city);
    List<Hotel> findAllByCityAndFood(City city, Food food);
    List<Hotel> findAllByLevel(String level);
    List<Hotel> findAllByCityAndLevel(City city, String level);

}
