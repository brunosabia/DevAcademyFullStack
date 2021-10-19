import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html',
  styleUrls: ['./cadastrar.component.css']
})
export class CadastrarComponent implements OnInit {
  nome = '';
  email = '';
  senha = '';
  conf = '';


  constructor(
    private servico: AuthService,
    private router: Router
    ) { }

  ngOnInit(): void {
  }

  cadastrar() {
    //console.log (this.nome,this.email,this.senha)
    // executar a funcao do auth.service.ts
    let observable = this.servico.cadastrar(this.nome, this.email, this.senha);
    observable.subscribe (
        {
          next: data => {
            // console.log(data)
            // salvar o token no sessionStorage
            window.sessionStorage.setItem("token", (<response>data).token);

            // direcionar o usuário para a home
            this.router.navigateByUrl("/home");
            console.log(data);
          },
          error: err => console.log(err),
          complete: () => console.log ("O observável já não tem mais o que observar")
        }
    );

  }
}
