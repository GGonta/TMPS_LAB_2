public class NonFictionBook extends Book {
  public NonFictionBook(int id, String title, String author, double price) {
    super(id, title, author, price);
  }

  @Override
  public double getDiscountPrice() {
    return getPrice();
  }
}
