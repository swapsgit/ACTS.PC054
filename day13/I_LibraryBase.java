package com.acts.assignment.day13;
import java.time.LocalDate;

public class I_LibraryBase {
	private String title;
	private I_Library_BookGenres bookGenera;
	private Integer price;
	private LocalDate publishedDate;
	private String authorName;
	private Integer quantity;
	//Unique ID : book title
	
	public I_LibraryBase(String title,
	 String bookGenera,
	Integer price,
	LocalDate publishedDate,
	String authorName,
	Integer quantity) {
		
		this.title = title;
		this.bookGenera = I_Library_BookGenres.valueOf(bookGenera);
		this.price = price;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.quantity = quantity;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "I_LibraryBase [title=" + title + ", bookGenera=" + bookGenera + ", price=" + price + ", publishedDate="
				+ publishedDate + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	

}
