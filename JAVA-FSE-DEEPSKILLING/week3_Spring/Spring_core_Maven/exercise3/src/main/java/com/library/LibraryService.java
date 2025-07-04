package com.library;

import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    public void issueBook() throws InterruptedException {
        Thread.sleep(500); // Simulating delay
        System.out.println("Book issued successfully.");
    }
}
