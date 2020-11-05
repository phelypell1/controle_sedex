import { Remetente } from './../models/remetente';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RemetenteService {

  constructor(private http: HttpClient) { 
    
  }

  getRemetente(): Observable<Remetente[]>{
    return this.http.get<Remetente[]>(`${environment.API}/remetente`);
  }

  getRemetenteAtivo(): Observable<Remetente[]>{
    return this.http.get<Remetente[]>(`${environment.API}/remetente/ativo`);
  }
}
