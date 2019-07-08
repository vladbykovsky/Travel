package com.example.backend.controller;

import com.example.backend.entity.Tour;
import com.example.backend.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/tour")
public class TourController {
    @Autowired
    private TourService tourService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Tour> getTourById(@PathVariable(name="id") int id){
        Optional<Tour> tour = tourService.findById(id);
        if (tour.isPresent()){
            return ResponseEntity.ok(tour.get());
        }else {
            return  ResponseEntity.notFound().build();
        }
    }

}
