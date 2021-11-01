package br.com.exlivraria.data.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "books")
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // significa que o Hibernate vai se responsabilizar pela geração dos Ids
	private Long id;
	
	@Column(name = "author", nullable = false, length = 180) //cria uma coluna com o nome author que nao pode ser null
	private String author;
	
	@Column(nullable = true, length = 100)	//cria uma coluna com o mesmo nome da variável
	@Temporal(TemporalType.DATE)
	private Date launch_date;
	
	@Column(nullable = false)	//cria uma coluna com o mesmo nome da variável
	private Double price;
	
	@Column(nullable = false, length = 250)	//cria uma coluna com o mesmo nome da variável
	private String title;

	/* INICIA ALTERAÇÕES FEITAS POR ADRIANO */
	@Column(nullable = false, length = 350)	//cria uma coluna com o mesmo nome da variável
	private String image;

	@Column(nullable = false, length = 750)	//cria uma coluna com o mesmo nome da variável
	private String description;

	@Column(nullable = false,length = 250)
	private String category;
	/* TERMINA ALTERAÇÕES FEITAS POR ADRIANO */

	@Column(length = 750)
	private String tags;
	
	public Book() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(Date launch_date) {
		this.launch_date = launch_date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/* INICIA ALTERAÇÕES FEITAS POR ADRIANO */
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Book)) return false;

		Book book = (Book) o;

		if (id != null ? !id.equals(book.id) : book.id != null) return false;
		if (author != null ? !author.equals(book.author) : book.author != null) return false;
		if (launch_date != null ? !launch_date.equals(book.launch_date) : book.launch_date != null) return false;
		if (price != null ? !price.equals(book.price) : book.price != null) return false;
		if (title != null ? !title.equals(book.title) : book.title != null) return false;
		if (image != null ? !image.equals(book.image) : book.image != null) return false;
		if (description != null ? !description.equals(book.description) : book.description != null) return false;
		if (category != null ? !category.equals(book.category) : book.category != null) return false;
		return tags != null ? tags.equals(book.tags) : book.tags == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (author != null ? author.hashCode() : 0);
		result = 31 * result + (launch_date != null ? launch_date.hashCode() : 0);
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (image != null ? image.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (category != null ? category.hashCode() : 0);
		result = 31 * result + (tags != null ? tags.hashCode() : 0);
		return result;
	}
}
