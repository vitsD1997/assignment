import java.util.Scanner;
class Book {
  private String title;
  private String author;
  private String publisher;
  private String isbn;
  private int year;
  private double price;
  private int quantity;
  public void setTitle(String title) {
    this.title = title;
  }
  public String getTitle() {
    return this.title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setIsBn(String isbn) {
    this.isbn = isbn;
  }

  public String getIsBn() {
    return this.isbn;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return this.year;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void increaseQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void decreaseQuantity(int quantity) {
    if (this.quantity >= quantity) 
    this.quantity -=quantity; 
    else System.out.println("Book quantity is not enough");
  }

  public double getInventoryValue() {
    return quantity * (double) (price);
  }
}

class BookTester {
  Book book = new Book();
  static Scanner sc = new Scanner(System.in);

  public void acceptRecord() {
    System.out.println(
      "=================================================================="
    );
    System.out.println("Enter the title of book");
    book.setTitle(sc.nextLine());
    System.out.println("Enter the name of author");
    book.setAuthor(sc.nextLine());
    System.out.println("Enter the name of publisher");
    book.setPublisher(sc.nextLine());
    System.out.println("Enter the isbn number");
    book.setIsBn(sc.nextLine());
    System.out.println("Enter the year");
    book.setYear(sc.nextInt());
    System.out.println("Enter the price");
    book.setPrice(sc.nextDouble());
    System.out.println("Enter the Quantity");
    book.setQuantity(sc.nextInt());
    System.out.println("Enter the increase Quantity");
    book.increaseQuantity(sc.nextInt());
    System.out.println("Enter the decrease Quantity");
    book.decreaseQuantity(sc.nextInt());
    System.out.println(
      "=================================================================="
    );
  }

  public void printRecord() {
    System.out.println("Title Book is " + book.getTitle());
    System.out.println("Author of Book is " + book.getAuthor());
    System.out.println("Publisher of Book is " + book.getPublisher());
    System.out.println("IsBn Number of Book are " + book.getIsBn());
    System.out.println("Year of Book  " + book.getYear());
    System.out.println("Price of Book $ " + book.getPrice());
    System.out.println("Quantity of Book is " + book.getQuantity());
    System.out.println("Quantity of Book is " + book.getInventoryValue() + "$");
    System.out.println(
      "=================================================================="
    );
  }

  public static int menuList() {
    System.out.println("0.Exit");
    System.out.println("1.Accept Record.");
    System.out.println("2.Print Record");
    System.out.print("Enter choice  : ");
    return sc.nextInt();
  }
}

class Inventory {

  public static void main(String args[]) {
    int choice;
    BookTester noteBook = new BookTester();
    while ((choice = noteBook.menuList()) != 0) {
      switch (choice) {
        case 1:
          noteBook.acceptRecord();
          break;
        case 2:
          noteBook.printRecord();
          break;
      }
    }
  }
}
