import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { HomeComponent } from './components/home/home.component';
import { Routes, RouterModule} from "@angular/router";
import { FooterComponent } from './components/footer/footer.component';
import { CarouselComponent } from './components/carousel/carousel.component';
import { HttpClientModule} from "@angular/common/http";
import { FormsModule} from "@angular/forms";
import { CountriesComponent } from './components/countries/countries.component';
import { TourComponent } from './components/tour/tour.component';
import { ToursByCountryComponent } from './components/tours-by-country/tours-by-country.component';
import { BusTourComponent } from './components/bus-tour/bus-tour.component';
import { AirTourComponent } from './components/air-tour/air-tour.component';
import { ReservationComponent } from './components/reservation/reservation.component';
import { BsDropdownModule, ModalModule, TooltipModule} from "ngx-bootstrap";
import { ContactsComponent } from './components/contacts/contacts.component';
import { ErrorComponent } from './components/error/error.component';

const appRoutes: Routes = [
  {path: '', component:HomeComponent},
  {path: 'header', component:HeaderComponent},
  {path: 'footer', component:FooterComponent},
  {path: 'countries', component:CountriesComponent},
  {path: 'tour/:id', component:TourComponent},
  {path: 'country/:id', component: ToursByCountryComponent},
  {path: 'bus-tour', component: BusTourComponent},
  {path: 'air-tour', component: AirTourComponent},
  {path: 'reservation', component: ReservationComponent},
  {path: 'contacts', component: ContactsComponent},
  {path: '**', component:ErrorComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent,
    CarouselComponent,
    CountriesComponent,
    TourComponent,
    ToursByCountryComponent,
    BusTourComponent,
    AirTourComponent,
    ReservationComponent,
    ContactsComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
    FormsModule,
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot(),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
