import { Component, OnInit } from '@angular/core';
import { prioridade, Tarefa } from 'src/app/models/Tarefa';

@Component({
  selector: 'app-lista-de-tarefas',
  templateUrl: './lista-de-tarefas.component.html',
  styleUrls: ['./lista-de-tarefas.component.css']
})
export class ListaDeTarefasComponent implements OnInit {

  tarefasLista:Tarefa[] =[
    {
      texto: "Lavar o carro",
      feita: true,
      prioridade: prioridade.alta
    },
    {
      texto: "Lavar o tapete",
      feita: true,
      prioridade: prioridade.baixa
    },
    {
      texto: "tomar banho",
      feita: false,
      prioridade: prioridade.alta
    }

  ]
  constructor() { }

  ngOnInit(): void {
  }

}
