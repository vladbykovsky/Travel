import { Component, OnInit } from '@angular/core';
import {TourModel} from "../../models/tour.model";
import {TourService} from "../../services/tour.service";

@Component({
  selector: 'app-air-tour',
  templateUrl: './air-tour.component.html',
  styleUrls: ['./air-tour.component.css']
})
export class AirTourComponent implements OnInit {

  public transport: string = "Самолет";
  public tours: TourModel[];
  public page: number = 0;
  public size: number = 32;
  public sort: string = 'price';
  public order: string = 'low';
  public totalPages: Array<number>;

  constructor(private tourService: TourService) { }

  ngOnInit() {
    this.getAirTours();
  }

  public getAirTours():void{
    this.tourService.getToursByTransport(this.transport, this.page, this.size, this.sort, this.order).subscribe(value=>{
      this.tours = value['content'];
      this.totalPages = new Array<number>(value['totalPages']);
    })
  }

  public goPage(page: number):void{
    this.page = page;
    this.getAirTours();
  }

  public goNext(page: number):void{
    if(page == this.totalPages.length-1){
      this.page = page;
    }else if(page < this.totalPages.length-1){
      this.page = page + 1;
    }
    this.getAirTours();
  }

  public goPrev(page: number):void{
    if(page == 0){
      this.page = page;
    }else if(page > 0){
      this.page = page - 1;
    }
    this.getAirTours();
  }

  public setSize(size: number):void{
    this.size = size;
    this.getAirTours();
  }

}
