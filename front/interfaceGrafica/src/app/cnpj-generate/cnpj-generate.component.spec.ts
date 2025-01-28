import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CnpjGenerateComponent } from './cnpj-generate.component';

describe('CnpjGenerateComponent', () => {
  let component: CnpjGenerateComponent;
  let fixture: ComponentFixture<CnpjGenerateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CnpjGenerateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CnpjGenerateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
