import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private readonly url = "http://contatos-nodb.herokuapp.com";
  constructor(private http:HttpClient) { }

  cadastrar(nome:string, email:string, senha:string){
    //cria um json
    let u = {nome, email, senha};
    //quando acessado com um post, redireciona pro server passando o U no body (se colocar virgula após o body, da pra colocar header params)
    this.http.post(this.url + "/registrar",u).subscribe({
      next: data => console.log(data),
      error: err => console.log(err),
      complete: () => console.log("O observable já não tem mais o que observar!")
    });
    console.log(nome,email,senha);
  }
}
