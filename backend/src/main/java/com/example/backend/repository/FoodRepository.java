package com.example.backend.repository;

import com.example.backend.entity.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository<Food, Integer> {

    List<Food> findAll();
    Food findByType(String type);

}
