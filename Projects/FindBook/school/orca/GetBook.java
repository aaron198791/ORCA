package school.orca;

import java.lang.*;
import java.util.*;
import school.orca.Book;

public class GetBook {
	public static void main(String[] args) {
		Book book = new Book("The Spellman Files", "Lisa Lutz", 900000, "magazine");
		
		System.out.println(book.getTitle()+", "+book.getAuthor()+", "+book.getNumber()+", "+book.getBookType());
	}
}