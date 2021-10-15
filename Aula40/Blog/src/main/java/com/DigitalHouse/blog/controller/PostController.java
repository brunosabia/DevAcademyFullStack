package com.DigitalHouse.blog.controller;

import com.DigitalHouse.blog.model.Postagem;
import com.DigitalHouse.blog.repository.PostagemRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostController {

    @Autowired //injeção de dependencia
    private PostagemRepository repository;

    @GetMapping
    public ResponseEntity<List<Postagem>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")//monta uma url que onde indicamos o id do item desejado
    //precisamos usar dentro da passagem do parâmetro a anotação PathVariable pra dizer
    //ao Spring que cuide da parte de trazer da url a informação e use com parametro.
    public ResponseEntity<Postagem> getById(@PathVariable Long id ){

        //vamos precisar usar um optional e expressão lambda
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());

        //se der tudo certo o objeto encontrado vem no responseEntity.om
        //pode não existi então o orElse informar o not found
    }


    @GetMapping("/titulo/{titulo}")  //este mapping é similar ao anterior mas incluímos a /titulo
    //lembrando, podemos ter 1 postagem ou mais de uma postagem com o titulo
    //por isso nesse caso lembrando o primeiro mapping nós iremos fazer uma
    //List do tipo postagem para este retorno

    public ResponseEntity <List<Postagem>> getByTitulo(@PathVariable String titulo){
        //atenção no PathVariable, não pode esquece

        return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
    }

    @GetMapping("/texto/{texto}")  //este mapping é similar ao anterior mas incluímos a /texto
    //lembrando, podemos ter 1 postagem ou mais de uma postagem com o titulo
    //por isso nesse caso lembrando o primeiro mapping nós iremos fazer uma
    //List do tipo postagem para este retorno

    public ResponseEntity <List<Postagem>> getByTexto(@PathVariable String texto){
        //atenção no PathVariable, não pode esquece

        return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(texto));
    }

}
