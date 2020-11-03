import { AppCommonModule } from './../../app.common.module';
import { DestinatariosRoutingModule } from './destinatarios.routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DestinatariosComponent } from './destinatarios.component';
import { InputMaskModule } from 'primeng';



@NgModule({
  declarations: [DestinatariosComponent],
  imports: [
    CommonModule,
    DestinatariosRoutingModule,
    AppCommonModule,
    InputMaskModule
  ]
})
export class DestinatariosModule { }
