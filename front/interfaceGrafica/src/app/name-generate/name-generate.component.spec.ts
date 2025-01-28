import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NameGenerateComponent } from './name-generate.component';

describe('NameGenerateComponent', () => {
  let component: NameGenerateComponent;
  let fixture: ComponentFixture<NameGenerateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [NameGenerateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NameGenerateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
