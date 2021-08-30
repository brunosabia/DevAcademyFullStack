export interface Tarefa{
    feita: boolean;
    texto: string;
    prioridade?: prioridade;

}

export enum prioridade{
    baixa = 1,
    medio,
    alta
}