package groceryList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.ArrayList;

public class GroceryApp {

    public static void main(String[] args) {
        ArrayList<item> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Would you like create a shopping list? (Y / N)");
            String input = sc.nextLine();
            cart.clear();
            if (input.equalsIgnoreCase("n")){
                break;
            } else if (input.equalsIgnoreCase("y")){
                while (true) {


                    item Apple = new item("food", "Apple", 0.99);
                    item Banana = new item("food", "Banana", 1.99);
                    item Jackfruit = new item("food", "Jackfruit", 5.99);
                    item Toothpaste = new item("hygiene", "Toothpaste", 2.99);
                    item Shampoo = new item("hygiene", "Shampoo", 938746.99);
                    item HemorrhoidCream = new item("hygiene", "Hemorrhoid-Cream", 0.01);
                    item Knife = new item("utensils", "Knife", 9.99);
                    item Spoon = new item("utensils", "Spoon", 5.99);
                    item Spatula = new item("utensils", "Spatula", 10.98);

                    HashMap<String, item> foodA = new HashMap<>();
                    foodA.put("1", Apple);
                    foodA.put("2", Banana);
                    foodA.put("3", Jackfruit);
                    categories food = new categories("Food", foodA);

                    HashMap<String, item> hygieneA = new HashMap<>();
                    hygieneA.put("1", Toothpaste);
                    hygieneA.put("2", Shampoo);
                    hygieneA.put("3", HemorrhoidCream);
                    categories hygiene = new categories("Hygiene", hygieneA);

                    HashMap<String, item> utensilsA = new HashMap<>();
                    utensilsA.put("1", Knife);
                    utensilsA.put("2", Spoon);
                    utensilsA.put("3", Spatula);
                    categories utensils = new categories("Utensils", utensilsA);

                    HashMap<String, categories> categories = new HashMap<>();
                    categories.put("1", food);
                    categories.put("2", hygiene);
                    categories.put("3", utensils);

                    System.out.print("Would you like to add an item or finalize list?\n1: Add an item\n2: Finalize List");
                    input = sc.nextLine();
                    if (input.equalsIgnoreCase("2")){
                        double total = 0;
                        int apples = 0;
                        int bananas = 0;
                        int jackfruits = 0;
                        int toothpastes = 0;
                        int shampoo = 0;
                        int hems = 0;
                        int knives = 0;
                        int spoons = 0;
                        int spatulats = 0;
                        System.out.println(cart.size());
                        for (int i = 0; i < cart.size() ; i++){
                            switch (cart.get(i).name){
                                case "Apple": {
                                    apples++;
                                    total += Apple.price;
                                    break;
                                }
                                case "Banana":{
                                    bananas++;
                                    total += Banana.price;
                                    break;
                                }
                                case "Jackfruit":{
                                    jackfruits++;
                                    total += Jackfruit.price;
                                    break;
                                }
                                case "Toothpaste":{
                                    toothpastes++;
                                    total += Toothpaste.price;
                                    break;
                                }
                                case "shampoo":{
                                    shampoo++;
                                    total += Shampoo.price;
                                    break;
                                }
                                case "Hemorrhoid-Cream":{
                                    hems++;
                                    total += HemorrhoidCream.price;
                                    break;
                                }
                                case "Knife":{
                                    knives++;
                                    total += Knife.price;
                                    break;
                                }
                                case "Spoon":{
                                    spoons++;
                                    total += Spoon.price;
                                    break;
                                }
                                case "Spatula": {
                                    spatulats++;
                                    total += Spatula.price;
                                    break;
                                }
                            }
                        }

                        System.out.println("Food: ");
                        if (apples > 0){
                            System.out.println("Apples: " + apples);
                        }
                        if (bananas > 0){
                            System.out.println("Bananas: " + bananas);
                        }
                        if (jackfruits > 0){
                            System.out.println("Jackfruit: " + jackfruits);
                        }
                        System.out.println("Hygiene: ");
                        if (hems > 0){
                            System.out.println("Preparation H: " + hems);
                        }
                        if (shampoo > 0){
                            System.out.println("Shampoo: " + shampoo);
                        }
                        if (toothpastes > 0){
                            System.out.println("Toothpaste: " + toothpastes);
                        }

                        System.out.println("Utensils: ");
                        if (knives > 0){
                            System.out.println("Knives: " + knives);
                        }
                        if (spatulats > 0){
                            System.out.println("Spatulas: " + spatulats);
                        }
                        if (spoons > 0){
                            System.out.println("Spoons: " + spoons);
                        }
                        System.out.printf("Total price: $ %.2f%n", total);


                        break;
                    } else if (input.equalsIgnoreCase("1")){
                        for (HashMap.Entry<String, categories> item : categories.entrySet()) {
                            System.out.println(item.getKey() + " " + item.getValue().getName());
                        }
                        System.out.println("Select a category...");
                        input = sc.nextLine();
                            switch (input){
                                case "1": {
                                    for (HashMap.Entry<String, item> item : foodA.entrySet()) {
                                        System.out.println(item.getKey() + " " + item.getValue().name);
                                    }
                                    System.out.println("Which item would you like?");
                                    input = sc.nextLine();

                                    int amount;
                                    System.out.println("How many?");
                                    while (true) {
                                        try {
                                            amount = sc.nextInt();
                                            sc.nextLine();
                                            break;
                                        } catch (Exception e) {
                                            System.out.println("enter a NUMBER");
                                        }
                                    }
                                    for (int i = 0; i < amount; i++){
                                        switch (input){
                                            case "1": {
                                                cart.add(Apple);
                                                System.out.println(cart.size());
                                                break;
                                            }
                                            case "2": {
                                                cart.add(Banana);
                                                break;
                                            }
                                            case "3": {
                                                cart.add(Jackfruit);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "2": {
                                    for (HashMap.Entry<String, item> item : hygieneA.entrySet()) {
                                        System.out.println(item.getKey() + " " + item.getValue().name);
                                    }
                                    System.out.println("Which item would you like?");
                                    input = sc.nextLine();

                                    int amount;
                                    System.out.println("How many?");
                                    while (true) {
                                        try {
                                            amount = sc.nextInt();
                                            sc.nextLine();
                                            break;
                                        } catch (Exception e) {
                                            System.out.println("enter a NUMBER");
                                        }
                                    }
                                    for (int i = 0; i < amount; i++){
                                        switch (input){
                                            case "1": {
                                                cart.add(Toothpaste);
                                                break;
                                            }
                                            case "2": {
                                                cart.add(Shampoo);
                                                break;
                                            }
                                            case "3": {
                                                cart.add(HemorrhoidCream);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "3": {
                                    for (HashMap.Entry<String, item> item : utensilsA.entrySet()) {
                                        System.out.println(item.getKey() + " " + item.getValue().name);
                                    }
                                    System.out.println("Which item would you like?");
                                    input = sc.nextLine();

                                    int amount;
                                    System.out.println("How many?");
                                    while (true) {
                                        try {
                                            amount = sc.nextInt();
                                            sc.nextLine();
                                            break;
                                        } catch (Exception e) {
                                            System.out.println("enter a NUMBER");
                                        }
                                    }
                                    for (int i = 0; i < amount; i++){
                                        switch (input){
                                            case "1": {
                                                cart.add(Knife);
                                                break;
                                            }
                                            case "2": {
                                                cart.add(Spoon);
                                                break;
                                            }
                                            case "3": {
                                                cart.add(Spatula);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("unknown command");
                                    break;
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
