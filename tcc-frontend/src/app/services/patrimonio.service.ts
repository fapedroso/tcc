import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patrimonio } from '../formulario-patrimonio/patrimonio';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PatrimonioService {
  private readonly API = 'http://localhost:8080/patrimonios';

  constructor(private http: HttpClient) {}

  salvarPatrimonio(patrimonio: Patrimonio): Observable<Patrimonio> {
    return this.http.post<Patrimonio>(this.API, patrimonio);
  }
}
