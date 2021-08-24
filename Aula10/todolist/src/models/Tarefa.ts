

export class Tarefa{
    feita?:boolean;
    nome: string;
    prioridade?: prioridade;

    constructor(nome:string, prioridade:prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
        this.feita = false
    }

    imprimir():void{
        // [x] _____________ [prioridade]
        console.log( this.feita?"[x] ":"[ ] " + this.nome + " [" + this.prioridade + "]");
    }

    toRow():HTMLTableRowElement{
        let tr:HTMLTableRowElement = <HTMLTableRowElement>document.createElement('tr');
        tr.className = this.feita?"done":"";
        tr.innerHTML = `<td>
                    <input type="checkbox">
                    </td>
                    <td>
                     ${this.nome}
                    </td>
                    <td>
                    <i class="material-icons">delete</i>
                    </td>`;

                    //marcando/desmarcando  uma tarefa como feita
                    let checkbox = tr.querySelector('input');
                    checkbox.addEventListener("click",()=>{
                        this.feita = checkbox.checked;
                        tr.className = this.feita?"done":"";
                    });

                    // let bt = tr.querySelector('i');
                    // bt.addEventListener('click',()=>{
                    //     tr.remove();
                    // })
                    
                    return tr;
    }
    
}

export enum prioridade{
    baixa = 1,
    medio,
    alta
}