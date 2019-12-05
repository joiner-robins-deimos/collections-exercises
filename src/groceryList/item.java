package groceryList;

public class item {
    public String catagory;
    public String name;
    public int amount;
    public double price;
    public double total;
    public item(String catagory, String name, int amount, double price){
        this.catagory = catagory;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.total = price * (double) amount;
    }
}
