import { Vacina } from "./Vacina";
export interface Cachorro{
    nome:string;
    raca:string;
    manso:boolean;
    dataNascimento: Date;
    //vacinas?: Vacina[]; TORNAR OPCIONAL
    vacinas: Vacina[];
    donos:string[];
}

