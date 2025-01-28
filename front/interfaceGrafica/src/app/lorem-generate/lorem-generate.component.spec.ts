import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoremGenerateComponent } from './lorem-generate.component';

describe('LoremGenerateComponent', () => {
  let component: LoremGenerateComponent;
  let fixture: ComponentFixture<LoremGenerateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LoremGenerateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoremGenerateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
