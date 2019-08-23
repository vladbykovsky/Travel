import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor(private http: HttpClient) {
  }

  public getFoodById(foodId:number){
    return this.http.get("/api/food/" + foodId);
  }


}
