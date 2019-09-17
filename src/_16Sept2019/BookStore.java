package _16Sept2019;

import java.util.Scanner;

class BookDetails {
    private String bookName;
    private String author;
    private double isbn;

    public BookDetails(String bookName, String author, double isbn) {
        setAuthor(author);
        setBookname(bookName);
        setIsbn(isbn);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookname(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "----------------------------------" + '\n' +
                "Book Name:" + '\t' + bookName + '\n' +
                "Author Name:" + '\t' + author + '\n' +
                "ISBN:" + '\t' + isbn + '\n' +
                "----------------------------------";
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entryNo = input.nextInt();
        input.nextLine();

    }
}
