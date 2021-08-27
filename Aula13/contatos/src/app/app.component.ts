import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title:string = 'Lista de Contatos';

  constructor(){
    console.log(`Construindo a aplicação ${this.title}`)
  }
}
