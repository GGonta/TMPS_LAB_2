import java.util.HashMap;
import java.util.Map;

public class StockManager {
  private static StockManager instance = null;
  private Map<Integer, Integer> stock;

  private StockManager() {
    stock = new HashMap<>();
  }

  public static StockManager getInstance() {
    if (instance == null) {
      instance = new StockManager();
    }
    return instance;
  }

  public void addToStock(int bookId, int quantity) {
    if (stock.containsKey(bookId)) {
      stock.put(bookId, stock.get(bookId) + quantity);
    } else {
      stock.put(bookId, quantity);
    }
  }

  public void updateStock(int bookId, int quantity) {
    if (stock.containsKey(bookId)) {
      stock.put(bookId, stock.get(bookId) + quantity);
    }
  }

  public int getStockQuantity(int bookId) {
    return stock.getOrDefault(bookId, 0);
  }
}
