import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RgGenerateComponent } from './rg-generate.component';

describe('RgGenerateComponent', () => {
  let component: RgGenerateComponent;
  let fixture: ComponentFixture<RgGenerateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RgGenerateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RgGenerateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
