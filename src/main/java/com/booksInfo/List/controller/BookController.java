package com.booksInfo.List.controller;

import com.booksInfo.List.Application;
import com.booksInfo.List.entity.Book;
import com.booksInfo.List.service.BooksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/book")
@ResponseBody
public class BookController {
    private static final Logger logger= LoggerFactory.getLogger(Application.class);
    @Autowired
    BooksService booksService;
    @GetMapping("/getBooks")
    public  List<Book>getAllBooks(){
        List<Book> bookList=booksService.getAllBooks();
        logger.info("fetching books succesfully");
        return bookList;
    }
    @PostMapping("/Save")//save the data
    public void SaveBookInfo(@RequestBody Book book){
        booksService.SaveBookData(book);
    }
    @DeleteMapping("/delete")//detele the data
    public  void deleteData(@RequestBody Book book){
        booksService.deleteBookData(book);
    }
    @PutMapping("/edit")
    public void editeData(@RequestBody Book book){
        booksService.editeData(book);
    }
    @GetMapping("/getBook/{Id}")
    public Optional<Book> getBookById( @PathVariable Integer Id){
        Optional<Book> book=booksService.getBookById(Id);
        return book;
    }
    @DeleteMapping("/deleteBook/{Id}")
    public String deleteBookById(@PathVariable Integer Id){
        booksService.deleteById(Id);
        return  "succes";
    }

}
