package _16Sept2019;

class BookDetails{
    private String bookname;
    private String author;
    private double isbn;

    public String getBookname(){
        return bookname;
    }

    public String getAuthor(){
        return author;
    }

    public double getIsbn(){
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }
}

public class BookStore {
}
