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

  public transport: string = "Автобус";
  public tours: TourModel[];
  public page: number = 0;
  public size: number = 8;
  public sort: string = 'price';
  public order: string = 'low';
  public totalPages: Array<number>;

  constructor(private tourService: TourService) { }

  ngOnInit() {
    this.getBusTours();
  }

  public getBusTours():void{
    this.tourService.getToursByTransport(this.transport, this.page, this.size, this.sort, this.order).subscribe(value=>{
      this.tours = value['content'];
      this.totalPages = new Array<number>(value['totalPages']);
    })
  }

  public goPage(page: number):void{
    this.page = page;
    this.getBusTours();
  }

  public goNext(page: number):void{
    if(page == this.totalPages.length-1){
      this.page = page;
    }else if(page < this.totalPages.length-1){
      this.page = page + 1;
    }
    this.getBusTours();
  }

  public goPrev(page: number):void{
    if(page == 0){
      this.page = page;
    }else if(page > 0){
      this.page = page - 1;
    }
    this.getBusTours();
  }

  public setSize(size: number):void{
    this.size = size;
    this.getBusTours();
  }


}
