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

  constructor() { }

  ngOnInit(): void {
  }

  clickBtn_new_register(){

    this.btn_new_register = true;
    this.btn_save = false;
    this.btn_cancel = false;
  }

  click_cancel(){
    
    this.btn_cancel = true;
    this.btn_save = true;
    this.btn_new_register = false;

  }



}
