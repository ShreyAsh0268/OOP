package oop;
import java.util.*;
/*
 * Q7. WAP to create POJO class name as Book  with field id,name and price and author and input the book details and display it.
 */
class Book {
    private int id;
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(int id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println(getId() + " \t" + getName() + " \t" + getPrice() + " \t" + getAuthor());
    }
}

public class Q7_WAP_to_create_POJO_class_name_as_Book_with_field_id_name_and_price_and_author_and_input_the_book_details_and_display_it {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of books you want to add:");
        int size = s.nextInt();

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Book ID:");
            int id = s.nextInt();
            s.nextLine();

            System.out.println("Enter Book Name:");
            String name = s.nextLine();

            System.out.println("Enter Book Price:");
            double price = s.nextDouble();
            s.nextLine();

            System.out.println("Enter Book Author:");
            String author = s.nextLine();

            books.add(new Book(id, name, price, author));
        }

        System.out.println("\nID \tName \tPrice \tAuthor");
        for (int i = 0; i < books.size(); i++) {
            books.get(i).displayBookInfo();
        }
    }
}
