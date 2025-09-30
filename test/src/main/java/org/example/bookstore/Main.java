package org.example.bookstore;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("자바의 정석", "남궁성");
        EBook ebook = new EBook("스프링 부트 3 백과사전", "김영한", 20.5);

        book.displayInfo();
        ebook.displayInfo();
    }
}