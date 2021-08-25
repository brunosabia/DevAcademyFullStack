import { prioridade, Tarefa } from "./Tarefa";

export class ListaDeTarefas {

    tarefas: Tarefa[];
    input: HTMLInputElement;
    form: HTMLFormElement;
    tabela: HTMLTableElement;

    //localStorage!


    constructor(main: HTMLElement) {
        this.input = <HTMLInputElement><unknown>main.querySelector("#tf_2do");
        this.form = <HTMLFormElement>main.querySelector("#form");
        this.tabela = <HTMLTableElement>main.querySelector("#table");

        //tentando carregar tarefas do localStorage
        let dados: string = window.localStorage.getItem("todolist");
        if (dados == null) {
            window.localStorage.setItem("todolist", "[]");
            this.tarefas = [];
        } else {
            this.tarefas = JSON.parse(dados).map(
                t => {
                    let novaTarefa = new Tarefa(t.nome, t.prioridade);
                    novaTarefa.id = t.id;
                    return novaTarefa;
                })
        }

        this.mostrarTarefas();

        //quando o form for submit, que se adicione uma tarefa 
        this.form.addEventListener("submit", (evt) => {
            evt.preventDefault();
            this.adicionarTarefa();

        })
    }

    removerTarefa(t: Tarefa, tr: HTMLTableRowElement) {
        //removendo as trs da tabela e do array tarefas. 
        this.tarefas.splice(this.tarefas.indexOf(t), 1);
        document.getElementById(t.id).remove();
        //Salvar o Array de tarefas modificado agora no localStorage
        window.localStorage.setItem("todolist", JSON.stringify(this.tarefas));
        console.log(this.tarefas);
    }

    adicionarTarefa() {

        //verificar se o input é null
        if (this.input.value == '') return;
        //criar nova tarefa com os dados do form e prioridade baixa
        let t = new Tarefa(this.input.value, prioridade.baixa);
        //adicionar a tarefa criada ao array tarefas
        this.tarefas.push(t);
        //Salvar o Array de tarefas modificado agora no localStorage
        window.localStorage.setItem("todolist", JSON.stringify(this.tarefas));
        //criando a linha da tarefa
        let tr = t.toRow();
        //adiciona um evento pro i apagar o item da lista
        tr.querySelector("i").addEventListener("click", (evt) => this.removerTarefa(t, tr))

        //executar a exibirTarefas(tarefas)
        this.tabela.appendChild(tr);
        //limpar o campo toda vez que a tarefa seja adicionada
        this.input.value = "";


    }

    mostrarTarefas(): void {
        //zerar a tabela
        this.tabela.innerHTML = "";
        //preencher a tabela
        this.tarefas.forEach(
            t => {
                let tr = t.toRow();
                //adiciona um evento pro i apagar o item da lista
                tr.querySelector("i").addEventListener("click", (evt) => this.removerTarefa(t, tr))
                this.tabela.appendChild(tr);
            })
    }

}