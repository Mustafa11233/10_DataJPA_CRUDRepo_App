package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;
public interface BookRepo extends CrudRepository<Book, Double> {
	
	//select * from book where book_price > : price
	//public List<Book> findByBookPriceGreaterThan(Double price);
	
	//select * from book where book_price < : price
	//public List<Book> findByBookPriceLessThan(Double price);
	
	//select * from book where book_name = : bookName
	//public List<Book> findByBookName(String bookName);

	@Query(value = "select * from tbl_book", nativeQuery = true)
	public List<Book> getAllBooks();
	
	@Query("from Book")
	public List<Book> getAllBook();

}
