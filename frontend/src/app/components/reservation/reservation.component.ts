import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit {

  flag:boolean = false;

  constructor() { }

  ngOnInit() {
  }

  confirm():void{
    this.flag = true;
  }

}
