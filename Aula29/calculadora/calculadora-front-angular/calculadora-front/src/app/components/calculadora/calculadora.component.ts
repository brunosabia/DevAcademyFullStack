import { Component, OnInit } from '@angular/core';
import { CalculadoraService } from 'src/app/services/calculadora.service';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})
export class CalculadoraComponent implements OnInit {

  private a:number = 0;
  private b:number = 0;
  private o:number = 0;

  constructor(private servico:CalculadoraService) { 

  }

  calcular(){
    console.log("Vou calcular!")
    this.servico.calcular(this.a, this.b, this.o).subscribe(
      data => {console.log(data)}
    )
  }

  ngOnInit(): void {
  }

  //A
  public get operandoA() :number {
    return this.a;
  }
  public set operandoA($a : number){
    this.a = $a;
  }

  //B
  public get operandoB() :number {
    return this.b;
  }
  public set operandoB($b : number){
    this.b = $b;
  }

  //Operador
  public get operador() :number {
    return this.o;
  }
  public set operador($op : number){
    this.o = $op;
  }
}
