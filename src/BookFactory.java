public class BookFactory {
  public static Book createBook(String type, int id, String title, String author, double price) {
    switch (type) {
      case "Fiction":
        return new FictionBook(id, title, author, price);
      case "NonFiction":
        return new NonFictionBook(id, title, author, price);
      default:
        throw new IllegalArgumentException("Invalid book type: " + type);
    }
  }
}
