package _16Sept2019;

class BookDetails {
    private String bookname;
    private String author;
    private double isbn;

    public BookDetails(String bookname, String author, double isbn) {
        setAuthor(author);
        setBookname(bookname);
        setIsbn(isbn);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
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
        return "----------------------------------" +
                "Book Name:" + bookname + '\n' +
                "Author Name:" + author + '\n' +
                "ISBN:" + isbn +
                "---------------------------------";
    }
}

public class BookStore {
    public static void main(String[] args) {

    }
}
