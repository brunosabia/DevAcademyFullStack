import { prioridade, Tarefa } from "./Tarefa";

export class ListaDeTarefas {

    tarefas: Tarefa[];
    input: HTMLInputElement;
    form: HTMLFormElement;
    tabela: HTMLTableElement;

    constructor(main: HTMLElement) {

        this.input = <HTMLInputElement><unknown>main.querySelector("#tf_2do");
        this.form = <HTMLFormElement>main.querySelector("#form");
        this.tabela = <HTMLTableElement>main.querySelector("#table");
        this.tarefas = [];
        //quando o form for submit, que se adicione uma tarefa 
        this.form.addEventListener("submit", (evt) => {
            evt.preventDefault();
            this.adicionarTarefa();

        })

    }


    removerTarefa(t: Tarefa,tr: HTMLTableRowElement) {
        //removendo as trs da tabela e do array tarefas. 
        this.tarefas.splice(this.tarefas.indexOf(t), 1);
        tr.remove();

    }

    adicionarTarefa() {

        //verificar se o input é null
        if (this.input.value == '') return;
        //criar nova tarefa com os dados do form e prioridade baixa
        let t = new Tarefa(this.input.value, prioridade.baixa);
        //adicionar a tarefa criada ao array tarefas
        this.tarefas.push(t);
        //criando a linha da tarefa
        let tr = t.toRow();

        //adiciona um evento pro i apagar o item da lista
        tr.querySelector("i").addEventListener("click", (evt)=>this.removerTarefa(t,tr))
    
        //executar a exibirTarefas(tarefas)
        this.tabela.appendChild(tr);
        //limpar o campo toda vez que a tarefa seja adicionada
        this.input.value = "";

    }

    mostrarTarefas(): void {
        //limpar tarefas
        this.tabela.innerHTML = "";
        //mostrar tarefas no html 
        

    }

}