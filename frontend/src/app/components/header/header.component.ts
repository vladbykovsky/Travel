import { Component, OnInit } from '@angular/core';
import { CountryModel } from "../../models/country.model";
import {CountryService} from "../../services/country.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

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
