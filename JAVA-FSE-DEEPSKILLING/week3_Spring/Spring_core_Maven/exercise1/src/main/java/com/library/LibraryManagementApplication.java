package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            // Use context here
            // Example:
            // Book book = context.getBean("book", Book.class);
            // System.out.println(book);
        }
    }
}
