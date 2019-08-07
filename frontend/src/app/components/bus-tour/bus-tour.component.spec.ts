import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusTourComponent } from './bus-tour.component';

describe('BusTourComponent', () => {
  let component: BusTourComponent;
  let fixture: ComponentFixture<BusTourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusTourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusTourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
