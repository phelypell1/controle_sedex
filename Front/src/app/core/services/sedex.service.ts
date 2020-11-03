import { RegistroSedex } from './../models/registroSedex';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class SedexService {

  constructor(private http: HttpClient) { }

  listarSedex(): Observable<RegistroSedex[]> {
    return this.http.get<RegistroSedex[]>(`${environment.API}/sedex`);
  }

}
