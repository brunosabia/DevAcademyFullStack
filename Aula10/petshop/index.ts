import {Cachorro} from "./models/Cachorro";
import { Vacina } from "./models/Vacina";

let cachorro1:Cachorro ={
    nome:"Vintem",
    raca:"SRD",
    manso:false,
    dataNascimento: new Date('2010-01-01'),
    vacinas:[],
    donos:['Sérgio', 'Mariana']
}

function vacinarCachorro(cachorro:Cachorro, vacina:Vacina){
    cachorro.vacinas.push(vacina);
    console.log(`${cachorro.nome} foi vacinado com ${vacina.nome}`);
}

vacinarCachorro(cachorro1,{nome:"Antirrabica", dataDeAplicacao:new Date()});
console.log(cachorro1);