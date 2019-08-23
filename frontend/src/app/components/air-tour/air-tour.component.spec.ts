import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AirTourComponent } from './air-tour.component';

describe('AirTourComponent', () => {
  let component: AirTourComponent;
  let fixture: ComponentFixture<AirTourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AirTourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AirTourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
