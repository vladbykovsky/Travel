import {CountryModel} from "./country.model";
import {CityModel} from "./city.model";

export class TourModel {

  idTour:number;
  hotelId:number;
  country: CountryModel;
  city: CityModel;
  price: string;
  time: string;
  date: string;
  transport: string;
  description: string;

}
