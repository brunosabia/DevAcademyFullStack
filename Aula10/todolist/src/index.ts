// Importando estilos
import "./style.css";
import "material-icons/iconfont/material-icons.css";
import { Tarefa, prioridade } from "./models/Tarefa";



let t1 = new Tarefa("Pagar boletos", prioridade.alta);
let t2 = new Tarefa("Tomar banho", prioridade.alta);
let t3 = new Tarefa("Teste", prioridade.baixa);

t1.imprimir();
t2.imprimir();

let tarefas: Tarefa[] = [t1, t2, t3];



function exibirTarefas(tarefas: Tarefa[]): void {
    let tabela: HTMLTableElement = <HTMLTableElement>document.querySelector('table');
    
    for (const tarefa of tarefas) {
        tabela.appendChild(tarefa.toRow());
    }

}


document.querySelector("#form").addEventListener('submit', (evt) => {

    //interrompe o envio do form
    evt.preventDefault();
    tarefas = [];
    let input = document.querySelector('input').value;
    //criar nova tarefa com os dados do form e prioridade baixa
    let taref = new Tarefa(input, prioridade.baixa);
    //adicionar a tarefa criada ao array tarefas
    tarefas.push(taref);
    //executar a exibirTarefas(tarefas)
    exibirTarefas(tarefas);
})

exibirTarefas(tarefas);
console.log(tarefas);



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