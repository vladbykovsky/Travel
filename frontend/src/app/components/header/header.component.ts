import {Component, OnInit, TemplateRef} from '@angular/core';
import { CountryModel } from "../../models/country.model";
import {CountryService} from "../../services/country.service";
import {BsModalRef, BsModalService} from "ngx-bootstrap";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  public countries: CountryModel[];
  public modalRef: BsModalRef;

  constructor(private countryService: CountryService,
              private modalService: BsModalService) { }

  ngOnInit() {
    this.loadAllCountry();
  }

  public loadAllCountry():void{
    this.countryService.getAllCountries().subscribe((value:CountryModel[])=>{
      this.countries = value;
    } )
  }

  public _openModal(template: TemplateRef<any>): void {
    this.modalRef = this.modalService.show(template);
  }

}
