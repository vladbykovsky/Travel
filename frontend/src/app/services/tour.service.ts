import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class TourService {

  constructor(private http: HttpClient) {
  }

  public getTourById(tourId:number){
    return this.http.get("/api/tour/"+tourId);
  }

  public getToursByCountryId(countryId:number, page: number, size: number, sort: string, order: string){
    return this.http.get("/api/tour/country/" + countryId +
      "?page=" + page +
      "&size=" + size +
      "&sort=" + sort +
      "&order=" + order);
  }

  public getAllProducts(page: number, size: number, sort: string, order: string){
    return this.http.get("/api?page=" + page + "&size=" + size + "&sort=" + sort + "&order=" + order);
  }

  public getToursByTransport(transport:string, page: number, size: number, sort: string, order: string){
    return this.http.get("/api/tour/transport/" + transport +
      "?page=" + page +
      "&size=" + size +
      "&sort=" + sort +
      "&order=" + order);
  }

}
