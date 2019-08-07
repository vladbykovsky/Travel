package com.example.backend.service.impl;

import com.example.backend.entity.Food;
import com.example.backend.repository.FoodRepository;
import com.example.backend.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository){this.foodRepository = foodRepository;}

    @Override
    public Food findById(int id) {
        return foodRepository.findById(id);
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food findByType(String type) {
        return foodRepository.findByType(type);
    }

    @Override
    public Food saveFood(Food food) {
        return foodRepository.save(food);
    }
}
