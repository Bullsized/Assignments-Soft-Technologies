package com.company;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e24BookLibr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int booksCount = Integer.parseInt(scan.nextLine());

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        BookLibrary library = new BookLibrary() {{
            setName("Colibri");
            setBooks(new ArrayList<>());
        }};

        for (int i = 0; i < booksCount; i++) {
            String[] tokens = scan.nextLine().split(" ");

            Book book = new Book() {{
                setTitle(tokens[0]);
                setAuthor(tokens[1]);
                setPublisher(tokens[2]);
                setReleaseDate(LocalDate.parse(tokens[3], df));
                setIsbn(tokens[4]);
                setPrice(Double.parseDouble(tokens[5]));
            }};

            library.getBooks().add(book);
        }

        library.getBooks().stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.summingDouble(Book::getPrice)))
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int comparisonResult = Double.compare(b.getValue(), a.getValue());

                    if (comparisonResult == 0) {
                        comparisonResult = a.getKey().compareTo(b.getKey());
                    }

                    return comparisonResult;
                })
                .forEach((kvp) -> {
                    String author = kvp.getKey();
                    double totalSum = kvp.getValue();
                    System.out.printf("%s -> %.2f%n", author, totalSum);
                });
    }
}

class BookLibrary {
    private String name;
    private ArrayList<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}

class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private LocalDate releaseDate;
    private double price;
}