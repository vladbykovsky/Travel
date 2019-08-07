import { Component, OnInit } from '@angular/core';
import {TourService} from "../../services/tour.service";
import {TourModel} from "../../models/tour.model";
import {ActivatedRoute} from "@angular/router";
import {CountryModel} from "../../models/country.model";
import {CountryService} from "../../services/country.service";
import {HotelService} from "../../services/hotel.service";
import {HotelModel} from "../../models/hotel.model";
import {FoodService} from "../../services/food.service";
import {FoodModel} from "../../models/food.model";
import {CityModel} from "../../models/city.model";
import {CityService} from "../../services/city.service";

@Component({
  selector: 'app-tour',
  templateUrl: './tour.component.html',
  styleUrls: ['./tour.component.css']
})
export class TourComponent implements OnInit {

  public tour: TourModel;
  public country: CountryModel;
  public hotel: HotelModel;
  public food: FoodModel;
  public city: CityModel;

  constructor(private tourService: TourService,
              private countryService: CountryService,
              private hotelService: HotelService,
              private foodService: FoodService,
              private cityService: CityService,
              private activateRoute: ActivatedRoute) { }

  ngOnInit() {
    const id = this.activateRoute.snapshot.params['id'];
    this.loadTour(id);
  }

  public loadTour(id: number):void{
    this.tourService.getTourById(id).subscribe((value:TourModel)=>{
      this.tour = value;
      this.loadCountryById(this.tour.countryId);
      this.loadHotelById(this.tour.hotelId);
    })
  }

  public loadCountryById(id: number):void{
    this.countryService.getCountryById(id).subscribe((value: CountryModel)=>{
      this.country = value;
    })
  }

  public loadHotelById(id: number):void{
    this.hotelService.getHotelById(id).subscribe((value:HotelModel)=>{
      this.hotel = value;
      this.loadFoodById(this.hotel.foodId);
      this.loadCityById(this.hotel.cityId);
    })
  }

  public loadFoodById(id: number):void{
    this.foodService.getFoodById(id).subscribe((value:FoodModel)=>{
      this.food = value;
    })
  }

  public loadCityById(id: number):void{
    this.cityService.getCityById(id).subscribe((value:CityModel)=>{
      this.city = value;
    })
  }

}
