import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CityService {

  constructor(private http: HttpClient) {
  }

  public getCityById(cityId:number){
    return this.http.get("/api/city/" + cityId);
  }


}
