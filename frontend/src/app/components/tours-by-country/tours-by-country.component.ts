import { Component, OnInit } from '@angular/core';
import {TourService} from "../../services/tour.service";
import {TourModel} from "../../models/tour.model";
import {ActivatedRoute, Router} from "@angular/router";
import {CountryModel} from "../../models/country.model";
import {CountryService} from "../../services/country.service";

@Component({
  selector: 'app-tours-by-country',
  templateUrl: './tours-by-country.component.html',
  styleUrls: ['./tours-by-country.component.css']
})
export class ToursByCountryComponent implements OnInit {

  public tours: TourModel[];
  public country: CountryModel;

  public page: number = 0;
  public size: number = 4;
  public sort: string = "price";
  public order: string = "low";
  public totalPages: Array<number>;

  constructor(private tourService: TourService,
              private countryService: CountryService,
              private activateRoute: ActivatedRoute,
              private router: Router) { }

  ngOnInit() {
    this.loadAllByCountryId();
  }

  public loadAllByCountryId():void {
    const id = this.activateRoute.snapshot.params['id'];
    if (id <= 10){
      this.tourService.getToursByCountryId(id, this.page, this.size, this.sort, this.order).subscribe(value => {
        this.tours = value['content'];
        this.totalPages = new Array<number>(value['totalPages']);
      }, error => {
        this.router.navigate(['error']);
      })
    }else {
      this.router.navigate(['error']);
    }
  }

  public goPage(page: number):void{
    this.page = page;
    this.loadAllByCountryId();
  }

  public goNext(page: number):void{
    if(page == this.totalPages.length-1){
      this.page = page;
    }else if(page < this.totalPages.length-1){
      this.page = page + 1;
    }
    this.loadAllByCountryId();
  }

  public goPrev(page: number):void{
    if(page == 0){
      this.page = page;
    }else if(page > 0){
      this.page = page - 1;
    }
    this.loadAllByCountryId();
  }

  public setSize(size: number):void{
    this.size = size;
    this.loadAllByCountryId();
  }

  public setSort(sort: string):void{
    this.sort = sort;
    this.loadAllByCountryId();
  }

  public setOrder(order: string):void{
    this.order = order;
    this.loadAllByCountryId();
  }

}
