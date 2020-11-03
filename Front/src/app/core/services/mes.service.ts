import { Mes } from './../models/mes';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MESService {

  constructor(private http: HttpClient) { }

  listarMeses(): Observable<Mes[]> {
    return this.http.get<Mes[]>(`${environment.API}/mes`);
  }
}
