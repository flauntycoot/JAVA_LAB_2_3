package com.company;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.name.set("The Murders in the Reu Morgue");
        book.author.set("Edgar","Poe");
        book.year.setYear(1932);
        System.out.println(book.author.getName()+" "+book.author.getSurname());
        System.out.println(book.year.getYear());
        System.out.println(book.name.getName());
    }
}