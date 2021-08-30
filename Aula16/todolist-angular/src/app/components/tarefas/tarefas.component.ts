import { Component, OnInit ,Input} from '@angular/core';
import { Tarefa } from 'src/app/models/Tarefa';

@Component({
  selector: 'app-tarefas',
  templateUrl: './tarefas.component.html',
  styleUrls: ['./tarefas.component.css']
})
export class TarefasComponent implements OnInit {

  @Input('a') tar!: Tarefa;

  constructor() { }

  ngOnInit(): void {
  }

}
