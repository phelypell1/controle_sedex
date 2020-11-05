import { CidadesService } from 'src/app/core/services/cidades.service';
import { Cidade } from './../../core/models/Cidade';
import { EstadosService } from 'src/app/core/services/estados.service';
import { Estado } from './../../core/models/estado';
import { RemetenteService } from './../../core/services/remetente.service';
import { Remetente } from './../../core/models/remetente';
import { EmpresaService } from 'src/app/core/services/empresa.service';
import { Empresa } from './../../core/models/empresa';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registro-sedex',
  templateUrl: './registro-sedex.component.html',
  styleUrls: ['./registro-sedex.component.css']
})
export class RegistroSedexComponent implements OnInit {

  hoje: number = Date.now();
  btn_new_register = false;
  btn_edit = true;
  btn_cancel = true;
  btn_save = true;
  btn_tag = true;
  formulario = true;
  descricao_item = true;
  btn_Concluir = true;
  value;

  empresaRemetente: Empresa[];
  remetente_ativo: Remetente[];
  estados: Estado[];
  estado: Estado;
  cidades: Cidade[];

  constructor(
    private empresaService: EmpresaService,
    private remetenteService: RemetenteService,
    private estadoService: EstadosService,
    private cidadeService: CidadesService
  ) { }

  ngOnInit(): void {

    this.empresaService.getEmpresa().subscribe(data => {
      this.empresaRemetente = data;
      console.log(data);
    });

    this.remetenteService.getRemetenteAtivo().subscribe(data =>{
      this.remetente_ativo = data;
      console.log(this.remetente_ativo);
    });

    this.estadoService.listarEstados().subscribe(data => {
      this.estados = data;
      console.log(this.estados)
    });

    this.cidadeService.listarCidades().subscribe(data =>{
      this.cidades = data;
      console.log(this.cidades);
    });

  }

  clickBtn_new_register(){

    this.btn_new_register = true;
    this.btn_save = false;
    this.btn_cancel = false;
    this.formulario = false;
  }

  click_cancel(){
    this.btn_cancel = true;
    this.btn_save = true;
    this.btn_new_register = false;
    this.formulario = true;
  }

  click_gravar(){
    this.btn_save = true;
    this.formulario = true;
    this.descricao_item = false;
    this.btn_Concluir = false;
  }

}
