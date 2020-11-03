import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { DestinatarioService } from './../../core/services/destinatario.service';
import { Destinatario } from './../../core/models/destinatario';
import { Cidade } from './../../core/models/Cidade';
import { Estado } from './../../core/models/estado';
import { Empresa } from './../../core/models/empresa';
import { Component, OnInit } from '@angular/core';
import { EmpresaService } from 'src/app/core/services/empresa.service';
import { EstadosService } from 'src/app/core/services/estados.service';
import { CidadesService } from 'src/app/core/services/cidades.service';

@Component({
  selector: 'app-destinatarios',
  templateUrl: './destinatarios.component.html',
  styleUrls: ['./destinatarios.component.css']
})
export class DestinatariosComponent implements OnInit {
  ///Instancias para carregar os combox///
  empDestinatario: Empresa[];
  empTransportadora: Empresa[];
  cidades: Cidade[];
  estados: Estado[];
  destinatarios: Destinatario[];
  destinatario: Destinatario = new Destinatario();

  constructor(
    private empresaService: EmpresaService,
    private estadoService: EstadosService,
    private cidadeService: CidadesService,
    private destinatarioService: DestinatarioService,
    private fb: FormBuilder
  ) {

    this.empresaService.getDestinatarios().subscribe(data => {
      this.empDestinatario = data;
      console.log(this.empDestinatario);
    })

    this.empresaService.getTrasportadoras().subscribe(data => {
      this.empTransportadora = data;
      console.log(this.empTransportadora);
    })

    this.cidadeService.listarCidades().subscribe(data => {
      this.cidades = data;
      console.log(this.cidades);
    })

    this.estadoService.listarEstados().subscribe(data => {
      this.estados = data;
      console.log(this.estados)
    })

    this.destinatarioService.listarDestinatarios().subscribe(data => {
      this.destinatarios = data;
      console.log(this.destinatarios)
    })
  }


  ngOnInit(): void {
  }

  gravar(){
    console.log(this.destinatario);
    /*this.destinatarioService.gravar(this.destinatario).subscribe(data =>{
      this.destinatario = data;
      console.log(this.destinatario);
    })*/
   
  }

}
