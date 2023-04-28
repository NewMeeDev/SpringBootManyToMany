/**
 * 
 */
package com.mneumann1.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mneumann1.model.Book;
import com.mneumann1.model.Student;
import com.mneumann1.repository.BookRepository;
import com.mneumann1.repository.StudentRepository;

/**
 * @author MNEUMANN1
 *
 */
@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		// create the book-objects
		Book book1 = new Book(101, "Die Bibel");
		Book book2 = new Book(102, "Duden");
		Book book3 = new Book(103, "Atlas");
		
		// save this
		bookRepo.save(book1);
		bookRepo.save(book2);
		bookRepo.save(book3);
		
		// create the book sets
		Set<Book> bookSet1 = Set.of(book1, book3);
		Set<Book> bookSet2 = Set.of(book2, book3);
		
		// create student-objects
		Student student1 = new Student(50, "Max Lange", bookSet1);
		Student student2 = new Student(51, "Horst Müller", bookSet2);

		// save this
		studentRepo.save(student1);
		studentRepo.save(student2);

	}
}