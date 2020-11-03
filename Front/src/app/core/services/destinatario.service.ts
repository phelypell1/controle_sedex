import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Destinatario } from '../models/destinatario';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class DestinatarioService {

  constructor(private http: HttpClient) { }

  listarDestinatarios(): Observable<Destinatario[]> {
    return this.http.get<Destinatario[]>(`${environment.API}/destinatario`);
  }

  gravar(destinatario: Destinatario): Observable<Destinatario>{
    return this.http.post<Destinatario>(`${environment.API}/destinatario`, destinatario);
  }

  /*buscarUsuarioPorId(idUsuario: Usuario): Observable<Usuario> {
    return this.http.get<Usuario>(`${environment.API}/usuario/${idUsuario}`);
  }

  buscarUsuario(): Observable<Usuario> {
    return this.http.get<Usuario>(`${environment.API}/usuario`);
  }

  gravarUsuario(usuario: Usuario): Observable<Usuario> {
    return this.http.post<Usuario>(`${environment.API}/usuario`, usuario);
  }

  updateUsuario(usuario: Usuario): Observable<Usuario> {
    return this.http.put<Usuario>(`${environment.API}/usuario`, usuario);
  }
  
  excluirUsuario(idUsuario: number ): Observable<Usuario> {
    return this.http.delete<Usuario>(`${environment.API}/usuario/${idUsuario}`);
  }*/
}
