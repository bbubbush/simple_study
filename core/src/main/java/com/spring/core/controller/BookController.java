package com.spring.core.controller;

import com.spring.core.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public BookService getBookService() {
        return this.bookService;
    }
}
