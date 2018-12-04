package school.orca;

import java.lang.*;
import java.util.*;

public class Book {
	private String title;
	private String author;
	private long ibsn13;
	private String bookType;
	
	public Book(final String title, final String author, final long ibsn13, final String bookType) {
		this.title = title;
		this.author = author;
		this.ibsn13 = ibsn13;
		
		if(bookType.equals("hardcover") || bookType.equals("paperback") || bookType.equals("ebook")) {
			this.bookType = bookType;
		}
		
		else {
			System.out.println("ERROR: invalid book type input -- leaving bookType empty!");
			this.bookType = "";
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public long getNumber() {
		return ibsn13;
	}
	
	public String getBookType() {
		return bookType;
	}
	
	public static void main(String[] args) {
		System.out.println("Successfully compiled Book class");
	}
}