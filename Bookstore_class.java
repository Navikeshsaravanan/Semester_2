public class Bookstore_class {
    public static void main() {
        Book book1 = new Book();
        System.out.println("Book Details (Default Constructor):");
        book1.display_details();
        Book book2 =new Book("The java handbook","Patrick Naughton",500.0);
        System.out.println("Book Details (Parameterized Constructor): ");
        book2.display_details();
        book2.setDetails("Effective Java","Joshua Bloch",800.0);
        System.out.println("Updated book details");
        book2.display_details();
    }
}

class Book{
    private  String title;
    private  String author;
    private double price;

    public Book() {
        title = "Not available";
        author = "Not available";
        price = 0.0;
    }
    public Book(String title,String author,double price) {
        this.title = title;
        this.author =author;
        this.price = price;
    }
    void setDetails(String title, String author, double price){
        this.title= title;
        this.author=author;
        this.price=price;
    }
    void display_details() {
        System.out.println("The title of the book is: "+title);
        System.out.println("The author of the book is : "+author);
        System.out.println("The price of the book is : "+price);
    }
}



