package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_Book")
public class Book {
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
