import { Component, OnInit } from '@angular/core';
import {TourModel} from "../../models/tour.model";
import {TourService} from "../../services/tour.service";
import {CountryModel} from "../../models/country.model";
import {CountryService} from "../../services/country.service";

@Component({
  selector: 'app-bus-tour',
  templateUrl: './bus-tour.component.html',
  styleUrls: ['./bus-tour.component.css']
})
export class BusTourComponent implements OnInit {

  public tours: TourModel[];
  public country: CountryModel[];
  public flag: number = 0;

  constructor(private tourService: TourService,
              private countryService: CountryService) { }

  ngOnInit() {
    this.getBusTours('Автобус');
  }

  public getBusTours(transport:string):void{
    this.tourService.getToursByTransport(transport).subscribe((value:TourModel[])=>{
      this.tours = value;
      //this.getCountryByTourId();
    })
  }

  // public getCountryByTourId():void{
  //   for (let i of this.tours){
  //     this.countryService.getCountryById(i.countryId).subscribe((value:CountryModel)=>{
  //       this.country.push(value);
  //       console.log(this.country)
  //     })
  //   }
  // }

  // public getCountryNameById(id: number):string {
  //   this.countryService.getCountryById(id).subscribe((value: CountryModel) => {
  //     this.country = value;
  //   });
  //   return this.country.name;
  // }


  public  getAllCountries():void{
    this.countryService.getAllCountries().subscribe((value: CountryModel[])=>{
      this.country = value;
    });
  }

}
