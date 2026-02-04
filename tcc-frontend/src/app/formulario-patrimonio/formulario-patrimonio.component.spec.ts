import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioPatrimonioComponent } from './formulario-patrimonio.component';

describe('FormularioPatrimonioComponent', () => {
  let component: FormularioPatrimonioComponent;
  let fixture: ComponentFixture<FormularioPatrimonioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormularioPatrimonioComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormularioPatrimonioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
