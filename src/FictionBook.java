public class FictionBook extends Book {
  public FictionBook(int id, String title, String author, double price) {
    super(id, title, author, price);
  }

  @Override
  public double getDiscountPrice() {
    return getPrice() * 0.9;
  }
}
