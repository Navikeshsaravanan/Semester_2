import java.util.*;
public class Library_Book_Management_System {
    public static class Book{
        private String title;
        private String author;
        private double price;

        Book(String title,String author,double price){
            this.author=author;
            this.price=price;
            this.title=title;
        }
        void displayDetails(){
            System.out.println(title+"("+author+")"+", Price: "+price);

        }
        String getAuthor(){
            return author;
        }
        double getPrice(){
            return price;
        }
    }


    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no books :");
        int no_of_books = scanner.nextInt();
        scanner.nextLine();

        boolean terminate = false;

        Book[] books = new Book[no_of_books];
        for (int i =0;i<no_of_books;i++){
            System.out.println("Enter the details of the Book :"+(i+1));
            System.out.print("Enter Title of the book: ");
            String title = scanner.nextLine();
            System.out.print("Enter Author of the book: ");
            String author = scanner.nextLine();
            System.out.print("Enter the book price: ");
            double price = scanner.nextDouble();
            books[i]=new Book(title,author,price);
            scanner.nextLine();
        }
        int choice;
        while(true){
            System.out.println("--- Library Manager ---\n1.Search By Author\n2.Books above certain price\n3.Display all\n4.Exit");
            System.out.println("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 ->{
                    System.out.print("Enter Author name to find:");
                    String author = scanner.nextLine();
                    boolean found = false;
                    for(Book i : books){
                        if (i.author.equalsIgnoreCase(author)){
                            System.out.println(i.title+"("+author+")"+", Price: "+i.price);
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("No book Found");
                    }
                }
                case 2 ->{
                    System.out.print("Enter Price limit: ");
                    double price_limit = scanner.nextDouble();
                    boolean found = false;
                    for(Book i :books){
                        if(i.price>price_limit){
                            System.out.println(i.title+"("+i.getAuthor()+")"+", Price: "+i.getPrice());
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("No Books Found!!");
                    }

                }
                case 3 ->{
                    for(Book i :books){
                        i.displayDetails();
                    }
                }
                case 4 ->{
                    System.out.println("Exiting!!");
                    terminate = true;
                }
            }
            if (terminate){
                break;
            }
        }
    }
}
