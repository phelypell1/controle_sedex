import { RegistroSedexComponent } from './registro-sedex.component';
import { RegistroSedexRoutingModule } from './registro-sedex.routing.module';
import { AppCommonModule } from 'src/app/app.common.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';



@NgModule({
  declarations: [RegistroSedexComponent],
  imports: [
    CommonModule,
    AppCommonModule,
    RegistroSedexRoutingModule
  ]
})
export class RegistroSedexModule { }
