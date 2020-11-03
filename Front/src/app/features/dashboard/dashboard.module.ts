import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppCommonModule } from 'src/app/app.common.module';
import { DashboardRoutingModule } from 'src/app/features/dashboard/dashboard.routing';
import { DashboardComponent } from 'src/app/features/dashboard/dashboard.component';
import { InputMaskModule } from 'primeng';
import { ButtonModule } from 'primeng/button';
import {DropdownModule} from 'primeng/dropdown';

@NgModule({
  imports: [
    CommonModule,
    DashboardRoutingModule,
    AppCommonModule,
    InputMaskModule,
    ButtonModule,
    DropdownModule
    
  ],
  declarations: [DashboardComponent]
})
export class DashboardModule { }