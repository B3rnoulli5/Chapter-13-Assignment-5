//Caleb Hedin, Assignment 4, 2/15/2024
//Pretty cool assignment. I used online databases to find ISBNS, and the UI is similar to the grocery list assignment that we created.
//Learn sorting and searching methods. I had a hard time with the searching methods, and you can tell because I used a boolean.
//The search methods are a little hard because I have everything case sensitive and spelling has to be perfect. But I think it's a good start.
//I should also use a .read method and have a database for the library. I think that would make things more clear.

import java.util.*;

public class Library {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            ArrayList<Books> books = new ArrayList<>();

            //List of books for my array
            books.add(new Books("9780140283334", "To Kill a Mockingbird", "Lee, Harper", "Fiction", "1960"));
            books.add(new Books("9780452284234", "1984", "Orwell, George", "Dystopian", "1949"));
            books.add(new Books("9780061120084", "The Great Gatsby", "Fitzgerald, F. Scott", "Classics", "1925"));
            books.add(new Books("9780143039433", "Pride and Prejudice", "Austen, Jane", "Romance", "1813"));
            books.add(new Books("9780547928203", "The Hunger Games", "Collins, Suzanne", "Dystopian", "2008"));
            books.add(new Books("9781400032716", "The Kite Runner", "Hosseini, Khaled", "Fiction", "2003"));
            books.add(new Books("9780547258303", "The Alchemist", "Coelho, Paulo", "Fiction", "1988"));
            books.add(new Books("9780385732550", "The Perks of Being a Wallflower", "Chbosky, Stephen", "YoungAdult", "1999"));
            books.add(new Books("9780141439792", "Jane Eyre", "Brontë, Charlotte", "Classics", "1847"));
            books.add(new Books("9780141182551", "The Catcher in the Rye", "Salinger, J.D.", "Fiction", "1951"));

            //Prompt to ask if the user wants to search or sort the database.
            System.out.println("Would you like to search for a book, or sort the books (search/sort)");
            String library = console.nextLine();
            while (true){

                //User now gets a list of options for sorting and chooses accordingle
            if (library.equals("sort")) {
                System.out.println("CHOOSE ONE OF THE FOLLOWING SORT METHODS");
                System.out.println("1 : Publication Year");
                System.out.println("2 : Author");

                String sort = console.nextLine();

                if (sort.equals("1")){
                    sortByPublicationYear(books);
                }
                else if (sort.equals("2")) {
                    sortByAuthor(books);
                    
                }
                else {
                    System.out.println("INVALID INPUT HERE ARE YOUR OPTIONS AGAIN:");
                    System.out.println();
                }}
            
                //User gets to sort from options below.
            else if
                (library.equals("search")) {
                    System.out.println("CHOOSE ONE OF THE FOLLOWING SEARCH METHODS");
                    System.out.println("1 : ISBN");
                    System.out.println("2 : Title");
                    System.out.println("3 : Author");
                    System.out.println("4 : Genre");
                    String search = console.nextLine();

                    if (search.equals("1")){
                        System.out.println("Enter the ISBN you would like to search:");
                        searchByIsbn(books, console.nextLine());
                    }
                    else if (search.equals("2")) {
                        System.out.println("Enter the Title you would like to search:");
                        searchByTitle(books, console.nextLine());
                    }
                    else if (search.equals("3")) {
                        System.out.println("Enter the Author you would like to search:");
                        searchByAuthor(books, console.nextLine());
                    }
                    else if (search.equals("4")) {
                        System.out.println("Enter the Genre you would like to search:");
                        searchByGenre(books, console.nextLine());
                    }
                    else {
                        System.out.println("INVALID INPUT HERE ARE YOUR OPTIONS AGAIN:");
                    }}}
        }
        

            
        }


    // Methods to sort the array, these are comparator methods and are the whole of chapter 13. Find this very useful when making custom methods.
    public static void sortByIsbn(ArrayList<Books> books){
        Collections.sort(books, new Comparator<Books>(){
            public int compare(Books book1, Books book2){
                return book1.getIsbn().compareTo(book2.getIsbn());
            }
        });
        for (Books book : books){
            System.out.println(book);
        }
    }


    public static void sortByTitle(ArrayList<Books> books){
        Collections.sort(books, new Comparator<Books>() {
            public int compare(Books book1, Books book2){
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });
        for (Books book : books){
            System.out.println(book);
        }
    }


    public static void sortByAuthor(ArrayList<Books> books){
        Collections.sort(books, new Comparator<Books>(){
            public int compare(Books book1, Books book2){
                return book1.getAuthor().compareTo(book2.getAuthor());
            }
        });
        for (Books book : books){
            System.out.println(book);
        }
    }


    public static void sortbyGenre(ArrayList<Books> books){
        Collections.sort(books, new Comparator<Books>(){
            public int compare(Books book1, Books book2){
                return book1.getGenre().compareTo(book2.getGenre());
            }
            
        });
        for (Books book : books){
            System.out.println(book);
        }
    }

    public static void sortByPublicationYear(ArrayList<Books> books){
        Collections.sort(books, new Comparator<Books>(){
            public int compare(Books book1, Books book2){
                return book1.getPublicationYear().compareTo(book2.getPublicationYear());
            }
            
        });
        for (Books book : books){
            System.out.println(book);
        }
    }


    //Methods to search the arrays, I opted for boolean methods because it's simple, but I believe it is really slow with a large database.
    public static void searchByIsbn(ArrayList<Books> books, String isbn){
        boolean found = false;
        for (Books book : books){
            if (book.getIsbn().equals(isbn)){
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("The ISBN that you entered " + isbn + " was not found in our database.");
        }
    }

    public static void searchByTitle(ArrayList<Books> books, String title){
        boolean found = false;
        for (Books book : books){
            if (book.getTitle().equals(title)){
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("The Title that you entered " + title + " was not found in our database.");
        }
    }

    public static void searchByAuthor(ArrayList<Books> books, String author){
        boolean found = false;
        for (Books book : books){
            if (book.getAuthor().equals(author)){
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("The Author that you entered " + author + " was not found in our database.");
        }
    }

    public static void searchByGenre(ArrayList<Books> books, String genre){
        boolean found = false;
        for (Books book : books){
            if (book.getGenre().equals(genre)){
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("The Genre that you entered " + genre + " was not found in our database.");
        }
    }
}