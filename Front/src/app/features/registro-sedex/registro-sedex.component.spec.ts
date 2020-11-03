import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistroSedexComponent } from './registro-sedex.component';

describe('RegistroSedexComponent', () => {
  let component: RegistroSedexComponent;
  let fixture: ComponentFixture<RegistroSedexComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegistroSedexComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistroSedexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
