import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  constructor(private http: HttpClient) {
  }

  public getAllCountries(){
    return this.http.get("/api/country/all");
  }

  public getCountryById(countryId:number){
    return this.http.get("/api/country/"+countryId);
  }

}
