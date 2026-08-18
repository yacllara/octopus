package program;
public class Customer{
  private int id;
  private String name;
  private int discount;
}

public Customerustumer (int id, String name, int discount) {
    this.id = id;
    this.name = name;
    this.discount = discount;
}

public int getId(){
    return this.id;
}

public string getName(){
    return this.name;
}

public int getDiscount(int discount){
    this.discount = discount
}

public string tostring(){
    return this.name + "(" + this.id + ")(" + this.discount + "%)";
}