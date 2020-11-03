import { Mes } from './../../core/models/mes';
import { RegistroSedex } from './../../core/models/registroSedex';
import { Component, OnInit } from '@angular/core';
import { Fieldset, SelectItem, SortEvent } from 'primeng';
import { SedexService } from 'src/app/core/services/sedex.service';
import { MESService } from 'src/app/core/services/mes.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-dashboard',
  templateUrl: 'dashboard.component.html',
  styleUrls: ['dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  pageSize: number;
  meses: Mes[] = [];
  itensSedex = [];

  constructor(private sedexService: SedexService,
    private mes: MESService) {
    this.pageSize = 5;

    this.sedexService.listarSedex().subscribe((res: any[]) => {
      this.itensSedex = res;
      console.log(this.itensSedex);
    });


    this.mes.listarMeses().subscribe(meses => {
      this.meses = meses;
      console.log(meses);
    })

  }
  ngOnInit() {

  }

}
