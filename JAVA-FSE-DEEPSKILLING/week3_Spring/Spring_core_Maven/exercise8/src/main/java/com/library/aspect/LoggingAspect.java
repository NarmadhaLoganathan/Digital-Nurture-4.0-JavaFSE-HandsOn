package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.BookService.addBook(..))")
    public void beforeAddBook() {
        System.out.println("Before adding a book (LoggingAspect)...");
    }

    @After("execution(* com.library.BookService.addBook(..))")
    public void afterAddBook() {
        System.out.println("After adding a book (LoggingAspect)...");
    }
}
