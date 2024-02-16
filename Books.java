//Caleb Hedin, Assignment 4, 2/15/2024

public class Books {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private String publicationYear;

    //Constructors
    public Books(String isbn, String title, String author, String genre, String publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    //Getter methods
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublicationYear(){
        return publicationYear;
    }

    //Override method to print to strings rather than the weird stuff
    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Publication Year:" + publicationYear;
    }
}
