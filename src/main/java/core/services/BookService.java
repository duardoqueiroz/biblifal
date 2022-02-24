package core.services;

import java.util.ArrayList;

import core.entities.Book;
import core.repository.IBookRepository;

public class BookService {
    IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void save(Book book) {
        bookRepository.save(book);
    }

    public void remove(int bookId) {
        Book doesNotExists = this.bookRepository.find(bookId);
        if(doesNotExists == null){
            return;
        }
        bookRepository.remove(bookId);
    }

    public Book find(int bookId) {
        Book Book = this.bookRepository.find(bookId);
        return Book;
    }

    public ArrayList<Book> findAll() {
        ArrayList<Book> books = this.bookRepository.findAll();
        return books;
    }

    public void update(Book editBook, int bookId){
        Book bookCurrentInfo = this.bookRepository.find(bookId);
        
        if(bookCurrentInfo == editBook || bookCurrentInfo == null){
            return;
        }
        this.bookRepository.update(editBook, bookId);
    }

}
