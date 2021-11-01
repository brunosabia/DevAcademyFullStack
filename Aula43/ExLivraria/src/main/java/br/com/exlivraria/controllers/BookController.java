package br.com.exlivraria.controllers;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import br.com.exlivraria.data.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.exlivraria.data.vo.v1.BookVO;
import br.com.exlivraria.services.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Book Endpoint", tags = {"BookEndpoint"})
@RestController
@RequestMapping("api/book/v1")
public class BookController {

	@Autowired
	private BookService services;

	@Autowired
	private PagedResourcesAssembler<BookVO> assembler;
	
	@ApiOperation(value = "Find all the books recorded")
	@GetMapping(produces = {"application/json", "application/xml" ,"application/x-yaml" })
	public ResponseEntity<?> findAll(
			@RequestParam(value="page",defaultValue = "0") int page, //queryParam de paginação
			@RequestParam(value="limit",defaultValue = "10") int limit, //queryParam de paginação
			@RequestParam(value="direction",defaultValue = "asc") String direction) { //ordenação da pagina

		var sortDirection = "desc".equalsIgnoreCase(direction) ? Sort.Direction.DESC :  Sort.Direction.ASC;

		Pageable pageable = PageRequest.of(page,limit,Sort.by(sortDirection,"title")); //passando os query params pro arquivo pageable
		Page<BookVO> books = services.findAll(pageable);
		
		books
		.stream() //vai pegar a lista (books) vai percorrer um a um com o foreach de acordo com o que especificarmos abaixo:
		.forEach(p -> p.add(
				linkTo(methodOn(BookController.class).findById(p.getKey())).withSelfRel()
				)
			); //no caso irá adicionar a todos os itens da lista um link apontando pra ele mesmo.

		PagedResources<?> resources = assembler.toResource(books);
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}

	@ApiOperation(value = "Find all the books recorded with specific title")
	@GetMapping(value = "/findBookByTitle/{title}",produces = {"application/json", "application/xml" ,"application/x-yaml" })
	public ResponseEntity<?> findBookByTitle(
			@PathVariable("title") String title,
			@RequestParam(value="page",defaultValue = "0") int page, //queryParam de paginação
			@RequestParam(value="limit",defaultValue = "15") int limit, //queryParam de paginação
			@RequestParam(value="direction",defaultValue = "asc") String direction) { //ordenação da pagina

		var sortDirection = "desc".equalsIgnoreCase(direction) ? Sort.Direction.DESC :  Sort.Direction.ASC;

		System.out.println(title);
		title = URLDecoder.decode(title, StandardCharsets.UTF_8);
		System.out.println(title);


		Pageable pageable = PageRequest.of(page,limit,Sort.by(sortDirection,"title")); //passando os query params pro arquivo pageable

		Page<BookVO> books = services.findBookByTitle(title,pageable);


		books
				.stream() //vai pegar a lista (books) vai percorrer um a um com o foreach de acordo com o que especificarmos abaixo:
				.forEach(p -> p.add(
								linkTo(methodOn(BookController.class).findById(p.getKey())).withSelfRel()
						)
				); //no caso irá adicionar a todos os itens da lista um link apontando pra ele mesmo.
		PagedResources<?> resources = assembler.toResource(books);
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}

	@ApiOperation(value = "Find specific book recorded")
	@GetMapping(value = "/{id}",produces = {"application/json", "application/xml" ,"application/x-yaml"})
	public BookVO findById(@PathVariable("id")Long id){
		
		BookVO bookVO = services.findById(id); //busca o Book no banco e armazena em bookVO.
		
		bookVO.add(linkTo(methodOn(BookController.class) //irá adicionar os links em BookController (neste caso ele linka com ele mesmo)
				.findById(id)) //o método que será linkado é o find by id
				.withSelfRel()); //serve para dizer que relaciona a si mesmo.
		return bookVO;	
	}

	@ApiOperation(value = "Creates book on the database")
	@PostMapping(produces = {"application/json", "application/xml","application/x-yaml" },
			 consumes = {"application/json", "application/xml","application/x-yaml" }) 
	public BookVO create(@RequestBody BookVO book){
		
		BookVO bookVO = services.create(book);	
		
		bookVO.add(linkTo(methodOn(BookController.class) //irá adicionar os links em BookController(neste caso ele linka com ele mesmo)
				.findById(bookVO.getKey())) //o método que será linkado é o find by id
				.withSelfRel()); //serve para dizer que relaciona a si mesmo.
		return bookVO;
	}

	@ApiOperation(value = "Find all the books by Category")
	@GetMapping(value = "/search/{category}", produces = {"application/json", "application/xml", "application/x-yaml"})
	public List<BookVO> findByCategory(@PathVariable("category")String category) {

		List<BookVO> books = services.findByCategory(category); //busca o Person no banco e armazena em personVO.

		books
				.stream() //vai pegar a lista (persons) vai percorrer um a um com o foreach de acordo com o que especificarmos abaixo:
				.forEach(p -> p.add(
								linkTo(methodOn(BookController.class).findByCategory(p.getCategory())).withSelfRel()
						)
				); //no caso irá adicionar a todos os itens da lista um link apontando pra ele mesmo.
		return books;
	}

	@ApiOperation(value = "Find all the books by Title")
	@GetMapping(value = "/search/{title}", produces = {"application/json", "application/xml", "application/x-yaml"})
	public List<BookVO> findByTitle(@PathVariable("title")String title) {

		List<BookVO> books = services.findByTitle(title); //busca o Person no banco e armazena em personVO.

		books
				.stream() //vai pegar a lista (persons) vai percorrer um a um com o foreach de acordo com o que especificarmos abaixo:
				.forEach(p -> p.add(
								linkTo(methodOn(BookController.class).findByTitle(p.getTitle())).withSelfRel()
						)
				); //no caso irá adicionar a todos os itens da lista um link apontando pra ele mesmo.
		return books;
	}

	@ApiOperation(value = "Find all the books by Author")
	@GetMapping(value = "/search/{author}", produces = {"application/json", "application/xml", "application/x-yaml"})
	public List<BookVO> findByAuthor(@PathVariable("title")String author) {

		List<BookVO> books = services.findByAuthor(author); //busca o Person no banco e armazena em personVO.

		books
				.stream() //vai pegar a lista (persons) vai percorrer um a um com o foreach de acordo com o que especificarmos abaixo:
				.forEach(p -> p.add(
								linkTo(methodOn(BookController.class).services.findByAuthor(p.getAuthor())).withSelfRel()
						)
				); //no caso irá adicionar a todos os itens da lista um link apontando pra ele mesmo.
		return books;
	}

	
	@ApiOperation(value = "Update specific book data")
	@PutMapping(produces = {"application/json", "application/xml" ,"application/x-yaml"},
			 consumes = {"application/json", "application/xml","application/x-yaml" }) 
	public BookVO update(@RequestBody BookVO book){
		
		BookVO bookVO = services.update(book);
		
		bookVO.add(linkTo(methodOn(BookController.class) //irá adicionar os links em BookController(neste caso ele linka com ele mesmo)
				.findById(bookVO.getKey())) //o método que será linkado é o find by id
				.withSelfRel()); //serve para dizer que relaciona a si mesmo.
		return bookVO;		
	}
	
	@ApiOperation(value = "Delete book recorded")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id")Long id){
		 services.delete(id);	
		 return ResponseEntity.ok().build();  //Adicionamos um retorno para o delete tb
	}
}




//http://localhost:8080/api/book/v1