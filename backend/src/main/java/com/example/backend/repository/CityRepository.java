package com.example.backend.repository;

import com.example.backend.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

    List<City> findAll();
    City findByName(String name);
    List<City> getAllByCountryId(int id);

}
