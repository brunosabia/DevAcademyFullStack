package br.com.exlivraria.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.exlivraria.data.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    public List<Book> findByCategory(String category);
    public List<Book> findByTitle(String title);
    public List<Book> findByAuthor(String author);


    //@Query("SELECT b FROM Book b WHERE b.title LIKE CONCAT('%',:title,'%') OR b.title LIKE LOWER(CONCAT('%',:title,'%')) OR b.title LIKE LOWER(CONCAT('%',:title)) OR b.author LIKE LOWER(CONCAT('%',:title,'%'))")

    //@Query("SELECT b FROM Book b WHERE b.title LIKE CONCAT('%',UPPER(substring(:title,1,1)),substring(:title,2),'%') OR b.author LIKE CONCAT('%',UPPER(substring(:title,1,1)),substring(:title,2),'%') OR b.title LIKE CONCAT('%',:title,'%')")
    @Query("SELECT b FROM Book b WHERE b.tags LIKE CONCAT('%',UPPER(:title),'%')")
    Page<Book> findBookByTitle(@Param("title") String title, Pageable pageable);

    //public Page<Book> findByTitleContainingIgnoreCase(String title);

    @Query("SELECT b FROM Book b WHERE b.author LIKE LOWER(CONCAT ('%',:title,'%'))")
    Page<Book> findBookByAuthor(@Param("title") String title, Pageable pageable);
}
