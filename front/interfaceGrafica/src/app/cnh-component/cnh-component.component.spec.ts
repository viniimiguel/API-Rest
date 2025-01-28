import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CnhComponentComponent } from './cnh-component.component';

describe('CnhComponentComponent', () => {
  let component: CnhComponentComponent;
  let fixture: ComponentFixture<CnhComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CnhComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CnhComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
