package OOP_2.Task5.models;

import lombok.Getter;

import java.util.Scanner;

public class Book {
    @Getter
    private String name;
    @Getter
    private String[] authors;
    @Getter
    private int year;
    @Getter
    private String nameOfPublisher;
    @Getter
    private String genre;
    @Getter
    private int sizeOfPages;
    private Scanner in;

    public Book(String name, String[] authors, int year, String publisher, String genre, int size) {
        this.name = name;
        this.authors = authors;
        this.year = year;
        this.nameOfPublisher = publisher;
        this.sizeOfPages = size;
    }

    public void createAuthors() {
        System.out.println("What is the number of authors");
        in = new Scanner(System.in);
        int n = in.nextInt();
        authors = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter full name of %d author: ", (i + 1));
            in = new Scanner(System.in);
            authors[i] = in.nextLine();
        }
    }

    public Book addAuthors() {
        System.out.print("Enter full name of new author: ");
        in = new Scanner(System.in);
        int size = authors.length;
        String name = in.nextLine();
        String[] n = new String[size + 1];
        for (int i = 0; i < size; i++) {
            n[i] = authors[i];
        }
        n[size] = name;
        return this;
    }

    public Book setName(String newName) {
        this.name = newName;
        return this;
    }

    public Book setYear(int newYear) {
        this.year = newYear;
        return this;
    }

    public Book setNameOfPublisher(String newPublisher) {
        this.nameOfPublisher = newPublisher;
        return this;
    }
    public Book setGenre(String newGenre) {
        this.genre = newGenre;
        return this;
    }
    public Book setSizeOfPages(int size){
        this.sizeOfPages=size;
        return this;
    }

}
