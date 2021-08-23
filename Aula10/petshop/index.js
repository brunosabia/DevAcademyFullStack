"use strict";
exports.__esModule = true;
var cachorro1 = {
    nome: "Vintem",
    raca: "SRD",
    manso: false,
    dataNascimento: new Date('2010-01-01'),
    vacinas: [],
    donos: ['Sérgio', 'Mariana']
};
function vacinarCachorro(cachorro, vacina) {
    cachorro.vacinas.push(vacina);
    console.log(cachorro.nome + " foi vacinado com " + vacina.nome);
}
vacinarCachorro(cachorro1, { nome: "Antirrabica", dataDeAplicacao: new Date() });
console.log(cachorro1);
