import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CpfGenerateComponent } from './cpf-generate.component';

describe('CpfGenerateComponent', () => {
  let component: CpfGenerateComponent;
  let fixture: ComponentFixture<CpfGenerateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CpfGenerateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CpfGenerateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
