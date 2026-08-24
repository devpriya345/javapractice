package com.p3.rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.p3.model.Book;


@RestController
public class BookRestController {
	
	private HashOperations<String, Integer, Book> opsForHash = null;
	
	public BookRestController(RedisTemplate<String, Book> redisTemplate) {
		
		this. opsForHash = redisTemplate.opsForHash();
		
	}
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book) {
	    opsForHash.put("book", book.getBookId(), book);
	    return ResponseEntity.status(HttpStatus.CREATED).body("Book Saved");
	}
	
	@GetMapping("/book/{bookId}")
	public ResponseEntity<Book> getBook(@PathVariable("bookId") Integer bookId){
		
		Book book = opsForHash.get("book", bookId);// to get data based on key
		
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	
	@GetMapping("/books")
	public ResponseEntity<Collection<Book>> getAllBooks(){
		
	Map<Integer, Book> entries	= opsForHash.entries("book");
	
	Collection<Book> values = entries.values();
	
	return new ResponseEntity<>(values,HttpStatus.OK);
	}
}
