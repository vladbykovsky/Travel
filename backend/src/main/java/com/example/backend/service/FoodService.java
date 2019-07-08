package com.example.backend.service;

import com.example.backend.entity.Food;

import java.util.List;

public interface FoodService {

    List<Food> findAll();
    Food findByType(String type);
    Food saveFood(Food food);

}
