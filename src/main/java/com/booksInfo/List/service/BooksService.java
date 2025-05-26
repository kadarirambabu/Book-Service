package com.booksInfo.List.service;
import com.booksInfo.List.entity.Book;
import com.booksInfo.List.repository.BooksRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BooksService {
    private static final Logger logger = LoggerFactory.getLogger(BooksService.class);
    public void doSomething(){
        logger.info("Service method doSomething() called.");
        try {
            int result = 10 ; // to trigger exception
        } catch (Exception e) {
            logger.error("Exception occurred: ", e);
        }
    }
    @Autowired
    BooksRepository booksRepository;
    public List<Book> getAllBooks(){
      List<Book>books=booksRepository.findAll();
        return books;
    }
    public void SaveBookData(Book book) {
        booksRepository.save(book);
    }

    public void deleteBookData(Book book) {
        booksRepository.delete(book);
    }

    public void editeData(Book book) {
        booksRepository.save(book);
    }
    public Optional<Book> getBookById(Integer Id){
        Optional<Book> book=booksRepository.findById(Id);
        return book;
    }
    public void deleteById(Integer Id){
        booksRepository.deleteById(Id);
    }
}
