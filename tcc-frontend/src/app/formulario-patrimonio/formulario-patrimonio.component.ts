import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { PatrimonioService } from '../services/patrimonio.service';

@Component({
  selector: 'app-formulario-patrimonio',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './formulario-patrimonio.component.html',
  styleUrl: './formulario-patrimonio.component.css',
})
export class FormularioPatrimonioComponent implements OnInit {
  patrimonioForm!: FormGroup;

  constructor(private patrimonioService: PatrimonioService) {}

  ngOnInit(): void {
    this.incializarFormulario();
  }

  incializarFormulario() {
    this.patrimonioForm = new FormGroup({
      nome: new FormControl(''),
      descricao: new FormControl(''),
    });
  }

  salvarPatrimonio() {
    const novoPatrimonio = this.patrimonioForm.value;

    console.log(this.patrimonioForm.value);
    console.log(novoPatrimonio);

    this.patrimonioService.salvarPatrimonio(novoPatrimonio).subscribe(() => {
      this.patrimonioForm.reset();
    });
  }
}
