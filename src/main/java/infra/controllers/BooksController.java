package infra.controllers;

import java.util.ArrayList;

import core.entities.Book;
import core.services.BookService;
import infra.postgresRepository.BookRepository;

public class BooksController {
    private BookRepository bookRepository;
    private BookService bookService;
    
    public BooksController(){
        this.bookRepository = new BookRepository();
        this.bookService = new BookService(bookRepository);
    }

    public void save(Book book) {
        this.bookService.save(book);
    }

    public void remove(int bookId) {
        this.bookService.remove(bookId);
    }

    public Book find(int bookId) {
        Book book = this.bookService.find(bookId);
        return book;
    }

    public ArrayList<Book> findAll() {
        ArrayList<Book> books = this.bookService.findAll();
        return books;
    }

    public void update(Book editBook, int bookId) {
        this.bookService.update(editBook, bookId);
    }

    
}
