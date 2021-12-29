package com.stryde.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stryde.modal.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@Autowired
	Environment envoirnment;

	@GetMapping("/data")
	public String getBookData() {

		return "data of BOOK-SERVICE, running on port: " + envoirnment.getProperty("local.server.port");
	}

	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Integer id) {
		return new Book(id, "Head First Java", 500.75);
	}

	@GetMapping("/all")
	public List<Book> getAllBooks() {

		return Arrays.asList(new Book(501, "Head First Java", 43.25), new Book(502, "Mastering Java", 42.26),
				new Book(503, "Java for Dummies", 52.36));
	}

	@GetMapping("/entity")
	public ResponseEntity<String> getEntityData() {

		return new ResponseEntity<String>("Hello from BookRestController",HttpStatus.OK);
		
	}
	
}
