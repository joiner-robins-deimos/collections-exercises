package groceryList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.ArrayList;

public class GroceryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Would you like create a shopping list? (Y / N)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("n")){
                break;
            } else if (input.equalsIgnoreCase("y")){
                while (true) {
                    ArrayList<item> cart = new ArrayList<>();

                    item Apple = new item("food", "Apple", 0, 0.99);
                    item Banana = new item("food", "Banana", 0, 1.99);
                    item Jackfruit = new item("food", "Jackfruit", 0, 5.99);
                    item Toothpaste = new item("hygiene", "Toothpaste", 0, 2.99);
                    item Shampoo = new item("hygiene", "Shampoo", 0, 938746.99);
                    item HemorrhoidCream = new item("hygiene", "Hemorrhoid-Cream", 0, 0.01);
                    item Knife = new item("utensils", "Knife", 0, 9.99);
                    item Spoon = new item("utensils", "Spoon", 0, 5.99);
                    item Spatula = new item("utensils", "Spatula", 0, 10.98);

                    HashMap<String, item> foodA = new HashMap<>();
                    foodA.put("1", Apple);
                    foodA.put("2", Banana);
                    foodA.put("3", Jackfruit);
                    catagories food = new catagories("Food", foodA);

                    HashMap<String, item> hygieneA = new HashMap<>();
                    hygieneA.put("1", Toothpaste);
                    hygieneA.put("2", Shampoo);
                    hygieneA.put("3", HemorrhoidCream);
                    catagories hygiene = new catagories("Hygiene", hygieneA);

                    HashMap<String, item> utensilsA = new HashMap<>();
                    utensilsA.put("1", Knife);
                    utensilsA.put("2", Spoon);
                    utensilsA.put("3", Spatula);
                    catagories utensils = new catagories("Utensils", utensilsA);

                    HashMap<String, catagories> categories = new HashMap<>();
                    categories.put("1", food);
                    categories.put("2", hygiene);
                    categories.put("3", utensils);

                    System.out.print("Would you like to add an item?");
                    input = sc.nextLine();
                    if (input.equalsIgnoreCase("n")){
                        break;
                    } else if (input.equalsIgnoreCase("y")){
                        for (HashMap.Entry<String, catagories> item : categories.entrySet()) {
                            System.out.println(item.getKey() + " " + item.getValue().getName());
                        }
                        System.out.println("Select a catagory...");
                        input = sc.nextLine();
                            switch (input){
                                case "1": {
                                    for (HashMap.Entry<String, item> item : foodA.entrySet()) {
                                        System.out.println(item.getKey() + " " + item.getValue().name);
                                    }
                                }
                                case "2": {

                                }
                                case "3": {

                                }
                                default: {
                                    System.out.println("unknown command");
                                }
                            }
                    } else {
                        System.out.println("Unknown command");
                    }
                }
            } else {
                System.out.println("Unknown command");
            }

        }
    }
}
