import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  constructor(private http: HttpClient) {
  }

  public getHotelById(hotelId:number){
    return this.http.get("/api/hotel/" + hotelId);
  }


}
