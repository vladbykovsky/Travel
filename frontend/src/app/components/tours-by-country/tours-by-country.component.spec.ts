import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ToursByCountryComponent } from './tours-by-country.component';

describe('ToursByCountryComponent', () => {
  let component: ToursByCountryComponent;
  let fixture: ComponentFixture<ToursByCountryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ToursByCountryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ToursByCountryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
