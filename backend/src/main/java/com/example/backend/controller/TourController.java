package com.example.backend.controller;

import com.example.backend.entity.Tour;
import com.example.backend.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @RequestMapping(value = "/hotelId/{id}", method = RequestMethod.GET)
    public List<Tour> getToursByHotelId(@PathVariable(name = "id") int id) {
        return (List<Tour>) tourService.getAllByHotelId(id);
    }

//    @RequestMapping(value = "/countryId/{id}", method = RequestMethod.GET)
//    public List<Tour> getToursByCountryId(@PathVariable(name = "id") int id) {
//        return (List<Tour>) tourService.getAllByCountryId(id);
//    }

//    @RequestMapping(value = "/byCountryId/{id}", method = RequestMethod.GET)
//    public List<Tour> getToursByCountryId(@PathVariable(name = "id") int id) {
//        return (List<Tour>) tourService.getAllByCountry_IdCountry(id);
//    }

    @RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
    public Page<Tour> getToursByCountryId(@PathVariable(name = "id") int id,
                                        @RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "4") int size,
                                        @RequestParam String sort,
                                        @RequestParam String order) {
        Page<Tour> tourPage = null;
        if(!sort.equals("null") && !order.equals("null")){
            switch (order){
                case "low":{
                    tourPage = tourService.getAllByCountry_IdCountry(id,
                            new PageRequest(page, size, Sort.by(sort).ascending()));
                    break;
                }
                case "high":{
                    tourPage = tourService.getAllByCountry_IdCountry(id,
                            new PageRequest(page, size, Sort.by(sort).descending()));
                    break;
                }
            }
        }
        if(!sort.equals("null") && order.equals("null")){
            tourPage = tourService.getAllByCountry_IdCountry(id, new PageRequest(page, size, Sort.by(sort).ascending()));
        }
        if(sort.equals("null") && !order.equals("null")){
            tourPage = tourService.getAllByCountry_IdCountry(id, new PageRequest(page, size, Sort.by("time").ascending()));
        }
        if(sort.equals("null") && order.equals("null")){
            tourPage = tourService.getAllByCountry_IdCountry(id, new PageRequest(page, size, Sort.by("idTour").descending()));
        }
        return tourPage;
    }

    @RequestMapping(value = "/transport/{transport}", method = RequestMethod.GET)
    public Page<Tour> getToursByTransport(@PathVariable(name = "transport") String transport,
                                          @RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "4") int size,
                                          @RequestParam String sort,
                                          @RequestParam String order){
        Page<Tour> tourPage = null;
        if(!sort.equals("null") && !order.equals("null")){
            switch (order){
                case "low":{
                    tourPage = tourService.getAllByTransport(transport,
                            new PageRequest(page, size, Sort.by(sort).ascending()));
                    break;
                }
                case "high":{
                    tourPage = tourService.getAllByTransport(transport,
                            new PageRequest(page, size, Sort.by(sort).descending()));
                    break;
                }
            }
        }
        if(!sort.equals("null") && order.equals("null")){
            tourPage = tourService.getAllByTransport(transport, new PageRequest(page, size, Sort.by(sort).ascending()));
        }
        if(sort.equals("null") && !order.equals("null")){
            tourPage = tourService.getAllByTransport(transport, new PageRequest(page, size, Sort.by("time").ascending()));
        }
        if(sort.equals("null") && order.equals("null")){
            tourPage = tourService.getAllByTransport(transport, new PageRequest(page, size, Sort.by("idTour").descending()));
        }
        return tourPage;
    }



}
