package br.com.exlivraria.data.vo.v1;

import java.io.Serializable;
import java.util.Date;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;

@JsonPropertyOrder({"id","author","title","image","price","category"})
public class BookVO extends ResourceSupport implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Mapping("id") // annotation para o Dozer reconhecer
	@JsonProperty("id")
	private Long key;
	private String author;
	private Date launch_date;
	private Double price;
	private String title;
	private String category;
	public String image;
	
	public BookVO() {
	
	}

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BookVO)) return false;
		if (!super.equals(o)) return false;

		BookVO bookVO = (BookVO) o;

		if (key != null ? !key.equals(bookVO.key) : bookVO.key != null) return false;
		if (author != null ? !author.equals(bookVO.author) : bookVO.author != null) return false;
		if (launch_date != null ? !launch_date.equals(bookVO.launch_date) : bookVO.launch_date != null) return false;
		if (price != null ? !price.equals(bookVO.price) : bookVO.price != null) return false;
		if (title != null ? !title.equals(bookVO.title) : bookVO.title != null) return false;
		if (category != null ? !category.equals(bookVO.category) : bookVO.category != null) return false;
		return image != null ? image.equals(bookVO.image) : bookVO.image == null;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (key != null ? key.hashCode() : 0);
		result = 31 * result + (author != null ? author.hashCode() : 0);
		result = 31 * result + (launch_date != null ? launch_date.hashCode() : 0);
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (category != null ? category.hashCode() : 0);
		result = 31 * result + (image != null ? image.hashCode() : 0);
		return result;
	}
}
