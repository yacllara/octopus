package program;

public class Book { 
    private int id;
    private String name;
    private Author author;
    private double price = 0.0;
    private int stock = 0;

    public Book (int id, String name, Author author){
        this(id, name, author, 0.0, 0);
    }

    public Book (int id, String name, Author author, double price){
        this(id, name, author, price, 0);
    }

    public Book (int id, String name, Author author, int stock){
        this(id, name, author, 0.0, stock);
    }

     public Book (int id, String name, Author author, double price, int stock){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
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

public Author getAuthor() {
return author;
}

public void setAuthor(Author author) {
this.author = author;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}

public int getStock() {
return stock;
}

public void setStock(int stock) {
this.stock = stock;
}

@Override
public String toString() {
return "Book[id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", stock=" + stock + "]";
}
}

