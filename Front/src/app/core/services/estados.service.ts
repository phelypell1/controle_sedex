import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Estado } from '../models/estado';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EstadosService {

  constructor( private http: HttpClient) { }

  listarEstados(): Observable<Estado[]>{
    return this.http.get<Estado[]>(`${environment.API}/estado`);
  }
}
