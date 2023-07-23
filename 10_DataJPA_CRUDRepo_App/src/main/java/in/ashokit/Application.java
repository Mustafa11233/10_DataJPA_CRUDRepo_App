package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = 
				SpringApplication.run(Application.class, args);
		
		BookRepo repo = ctxt.getBean(BookRepo.class);
		/*
		Book b1 =new Book();
		b1.setBookId(101);
		b1.setBookName("Spring");
		b1.setBookPrice(1000.00);
		
		Book b2 =new Book();
		b2.setBookId(102);
		b2.setBookName("Angular");
		b2.setBookPrice(3000.00);
		*/
		/*
		List<Book> book_list = new ArrayList<>();
		book_list.add(b1);
		book_list.add(b2);
		*/
		
		//repo.saveAll(Arrays.asList(b1,b2));
		/*
		boolean status = repo.existsById(105);
		System.out.println("Record Presence :: "+status);
		*/
		//System.out.println("Records Count ::"+repo.count());
		
		//System.out.println("Record is inserted..");
		
		//System.out.println(repo.getClass().getName());
		/*
		Optional<Book> findById = repo.findById(101);
		System.out.println(findById.get());
		*/
		/*
		Optional<Book> findById = repo.findById(102);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		*/
		/*
		Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,103,105));
		for(Book b:findAllById) {
			System.out.println(b);
			}
			*/
		/*
		Iterable<Book> findAll = repo.findAll();
		for(Book b1:findAll) {
			System.out.println(b1);
		}
		*/
		//repo.deleteById(105);
		/*
		if(repo.existsById(205)) {
		repo.deleteById(205);
		}else {
			System.out.println("No Record Available...");
		}
		*/
		//repo.delete(b1);
		//repo.deleteAll(Arrays.asList(b1,b2));
		//repo.deleteAll();
		/*
		List<Book> books = repo.findByBookPriceGreaterThan(2500.00);
		for(Book b2:books) {
			System.out.println(b2);
		}
		*/
		
		List<Book> book1 = repo.getAllBooks();
		for(Book b1:book1) {
			System.out.println(b1);
		}
		System.out.println("===============");
		repo.getAllBook();
		
		/*
		List<Book> bookName = repo.findByBookName("Spring");
		for(Book b: bookName) {
			System.out.println(b);
		}
		*/
		
		}
	}


