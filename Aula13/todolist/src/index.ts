// Importando estilos
import "./style.css";
import "material-icons/iconfont/material-icons.css";
import { Tarefa, prioridade } from "./models/Tarefa";
import { ListaDeTarefas } from "./models/ListaDeTarefas";

const lt : ListaDeTarefas = new ListaDeTarefas(document.querySelector("main"));

//window.alert("Turma boa retada!")

//let button = document.querySelector("#form button");
//let tabela = document.querySelector('table');
//let done = document.querySelector('#table tr')

// button?.addEventListener('click', criarTarefa);
// //pega o input e cria a tarefa
// function criarTarefa() {
//     let nome1: string = (<HTMLInputElement>document.querySelector("#tf_2do")).value;

//     if (nome1 != null) {

//         let prioridade1 = getPrioridade(nome1);

//         let tar: Tarefa = {
//             nome: nome1,
//             prioridade: prioridade1
//         }
//         tarefas.push(tar);

//         let taref = document.createElement('tr');
//         taref.setAttribute("name", tar.nome);
//         tabela.insertBefore(taref, done);
//     } else {
//         alert("Tarefa não pode estar vazio!");
//     }

// }