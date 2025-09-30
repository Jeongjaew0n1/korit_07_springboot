package org.example.bookstore;

public class EBook extends Book{
    double filesize;

    public EBook(String title, String author, double filesize) {
        super(title, author);
        this.filesize = filesize;
    }

    public void displayInfo() {
        System.out.println("제목 : " + title + ", 저자 : " + author + ", 파일 크기 : " + filesize + "MB");
    }
}