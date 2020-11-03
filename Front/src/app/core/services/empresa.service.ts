import { Empresa } from './../models/empresa';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable} from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EmpresaService {

  constructor(private http: HttpClient) {}

  getEmpresa(): Observable<Empresa[]>{
    return this.http.get<Empresa[]>(`${environment.API}/empresa`);
  }

   getDestinatarios(): Observable<Empresa[]>{
    return this.http.get<Empresa[]>(`${environment.API}/empresa/destinatarios`);
  }

  getTrasportadoras(): Observable<Empresa[]>{
    return this.http.get<Empresa[]>(`${environment.API}/empresa/transportadora`);
  }
}
