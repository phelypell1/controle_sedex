import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cidade } from '../models/Cidade';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  constructor(private http: HttpClient) { }

  listarCidades(): Observable<Cidade[]>{
    return this.http.get<Cidade[]>(`${environment.API}/cidade`);
  }
}
