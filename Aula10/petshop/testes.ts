console.log("TS é demais!");
console.log("raphael tem olhos de lince!");

let nome:string = "Tim Maia";
let idade:number = 50;

interface Pessoa{
    nome: string;
    idade: number;
    casado: boolean;
}

let p:Pessoa = {
    nome: "Tim Maia",
    idade: 50,
    casado: true
}

console.log("Nome: " + p.nome);
console.log("Idade: " + p.idade);
console.log("Casado: " + p.casado);