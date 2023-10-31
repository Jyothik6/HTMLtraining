package com.sample;

import java.util.Scanner;

abstract class Pizza {
    private String type;
    private String toppings;
    private String name;
    private float timeForPreparation;
    private int costOfPizza;
    private String size;

    public Pizza(String type, String toppings, String name, float timeForPreparation, String size) {
        if (type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("non-veg")) {
            this.type = type;
        } else {
            System.out.println("Only Veg and Non-Veg type is allowed");
            return;
        }

        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")) {
            this.size = size;
        } else {
            System.out.println("Only small and medium size pizzas are available");
            return;
        }

        this.toppings = toppings;
        this.name = name;
        this.timeForPreparation = timeForPreparation;
    }

    public abstract int calculateCost();

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return "Pizza details are: " + type + " " + name + " Pizza with " + toppings + " toppings, size: " + size +
                " which takes " + timeForPreparation + " min for preparation. Total cost: $" + calculateCost();
    }
}

class ItalianPizza extends Pizza {
    public ItalianPizza(String type, String toppings, String name, float timeForPreparation, String size) {
        super(type, toppings, name, timeForPreparation, size);
    }

    @Override
    public int calculateCost() {
        int cost = 0;

        if (getType().equalsIgnoreCase("veg")) {
            if (getSize().equalsIgnoreCase("small")) {
                cost = 200;
            } else if (getSize().equalsIgnoreCase("medium")) {
                cost = 350;
            }
        } else if (getType().equalsIgnoreCase("non-veg")) {
            if (getSize().equalsIgnoreCase("small")) {
                cost = 270;
            } else if (getSize().equalsIgnoreCase("medium")) {
                cost = 420;
            }
        }

       
        return cost;
    }
}

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Italian Pizza");
            System.out.println("2. Exit");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Enter pizza type (veg or non-veg): ");
                String type = scanner.nextLine();
                System.out.println("Enter pizza size (small or medium): ");
                String size = scanner.nextLine();
                System.out.println("Enter pizza toppings: ");
                String toppings = scanner.nextLine();
                System.out.println("Enter pizza name: ");
                String name = scanner.nextLine();
                System.out.println("Enter time for preparation (in minutes): ");
                float timeForPreparation = scanner.nextFloat();

                ItalianPizza italianPizza = new ItalianPizza(type, toppings, name, timeForPreparation, size);
                System.out.println(italianPizza.toString());
            } else if (choice.equals("2")) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
