import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  mostrandoModal = false;

  mostrarModal(){
    this.mostrandoModal = true;
  }

  esconderModal(){
    this.mostrandoModal = false;
  }
  
  constructor() { }

  ngOnInit(): void {
  }

}
