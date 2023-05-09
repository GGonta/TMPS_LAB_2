

public class Main {

  public static void main(String[] args) {
    Book book1 = BookFactory.createBook("Fiction", 1, "The Great Gatsby", "F. Scott Fitzgerald",
        20.0);
    Book book2 = BookFactory.createBook("NonFiction", 2, "Thinking, Fast and Slow",
        "Daniel Kahneman", 30.0);

    System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor());
    System.out.println(
        "Price: " + book1.getPrice() + ", Discount Price: " + book1.getDiscountPrice());

    System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor());
    System.out.println(
        "Price: " + book2.getPrice() + ", Discount Price: " + book2.getDiscountPrice());
  }
}