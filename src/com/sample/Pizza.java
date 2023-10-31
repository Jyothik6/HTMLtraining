package com.sample;

import java.util.Scanner;

class Pizza1 {
    protected String type;
    protected String toppings;
    protected String name;
    protected float timeForPreparation;

    public Pizza1(String type, String toppings, String name, float timeForPreparation) {
        if (type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("non-veg")) {
            this.type = type;
        } else {
            System.out.println("Invalid type");
            return;
        }

        this.toppings = toppings;
        this.name = name;
        this.timeForPreparation = timeForPreparation;
    }

    public String toString() {
        return "Pizza details are: " + type + " " + name + " Pizza with " + toppings + " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

public class ItalianPizza extends Pizza1 {
    public ItalianPizza(String type, String toppings, String name, float timeForPreparation) {
        super(type, toppings, name, timeForPreparation);
    }

    @Override
    public String toString() {
        return "Italian Pizza details are: " + type + " " + name + " Pizza with " + toppings + " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

class MexicanPizza extends Pizza1 {
    public MexicanPizza(String type, String toppings, String name, float timeForPreparation) {
        super(type, toppings, name, timeForPreparation);
    }

    @Override
    public String toString() {
        return "Mexican Pizza details are: " + type + " " + name + " Pizza with " + toppings + " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Italian Pizza");
            System.out.println("2. Mexican Pizza");
            System.out.println("3. Exit");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Enter pizza type (veg or non-veg): ");
                String type = scanner.nextLine();
                System.out.println("Enter pizza toppings: ");
                String toppings = scanner.nextLine();
                System.out.println("Enter pizza name: ");
                String name = scanner.nextLine();
                System.out.println("Enter time for preparation (in minutes): ");
                float timeForPreparation = scanner.nextFloat();

                ItalianPizza italianPizza = new ItalianPizza(type, toppings, name, timeForPreparation);
                System.out.println(italianPizza.toString());
            } else if (choice.equals("2")) {
                System.out.println("Enter pizza type (veg or non-veg): ");
                String type = scanner.nextLine();
                System.out.println("Enter pizza toppings: ");
                String toppings = scanner.nextLine();
                System.out.println("Enter pizza name: ");
                String name = scanner.nextLine();
                System.out.println("Enter time for preparation (in minutes): ");
                float timeForPreparation = scanner.nextFloat();

                MexicanPizza mexicanPizza = new MexicanPizza(type, toppings, name, timeForPreparation);
                System.out.println(mexicanPizza.toString());
            } else if (choice.equals("3")) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
            scanner.nextLine(); 

        }

        scanner.close();
    }
}
