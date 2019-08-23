import { Component, OnInit } from '@angular/core';
import {CountryModel} from "../../models/country.model";
import {CountryService} from "../../services/country.service";

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {

  public countries: CountryModel[];

  constructor(private countryService: CountryService) { }

  ngOnInit() {
    this.loadAllCountry();
  }

  public loadAllCountry():void{
    this.countryService.getAllCountries().subscribe((value:CountryModel[])=>{
      this.countries = value;
    } )
  }

}
