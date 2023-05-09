#În exemplul de cod pe care l-am scris sunt utilizate trei Creational Design Patterns diferite.
##Factory Method Pattern: 
__Este utilizat prin intermediul clasei BookFactory, care are o metodă statică createBook(). Această metodă creează obiecte de tipul Book, ascunzând detaliile de implementare și permitând astfel crearea de noi tipuri de cărți fără a fi necesară modificarea codului existent.__
>public class BookFactory {
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
##Abstract Factory Pattern: 
__Acesta este utilizat prin intermediul interfeței BookAbstractFactory și a claselor FictionBookFactory și NonFictionBookFactory care implementează această interfață. Fiecare fabrică concretă implementează metodele din interfața abstractă pentru a crea obiecte de tipul Book specific pentru tipul de carte.__
>public class FictionBook extends Book {
>  public FictionBook(int id, String title, String author, >double price) {
>    super(id, title, author, price);
>  }
>
>  @Override
  public double getDiscountPrice() {
    return getPrice() * 0.9;
  }
}


---



>public class NonFictionBook extends Book {
>  public NonFictionBook(int id, String title, String author, >double price) {
>    super(id, title, author, price);
>  }
>
>  @Override
  public double getDiscountPrice() {
    return getPrice();
  }
}

###Singleton Pattern:
__Mai întâi, vom crea o metodă statică getInstance() în clasa Inventory, care va returna instanța singleton. Această metodă va crea instanța Inventory dacă aceasta nu există deja și o va returna în caz contrar. În plus, constructorul clasei Inventory trebuie să fie privat, pentru a preveni crearea de noi instanțe ale acestei clase din afara clasei.__
>public class Inventory {
>    private static Inventory instance;
>
>    // constructor privat
>    private Inventory() {
>        // initializare stoc de cărți
>    }
>
>    // metoda statică pentru a obține instanța singleton
>    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }
>
>    // alte metode și atribute ale clasei
    public void addBook(Book book) {
        // adaugă cărțile în stoc
    }
}
