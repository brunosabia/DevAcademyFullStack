import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html',
  styleUrls: ['./cadastrar.component.css']
})
export class CadastrarComponent implements OnInit {
  nome = '';
  email = '';
  senha = '';
  conf = '';
  

  constructor() { }

  ngOnInit(): void {
  }

  cadastrar(){
    console.log(this.nome,this.email,this.senha);
  }

}
