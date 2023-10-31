package sample;

import java.util.ArrayList;
import java.util.Iterator;



class Student {
    private ArrayList<String> names = new ArrayList<>();

    public void setNames() {
        // Method to scan names of students and set them in the names ArrayList
        // For demonstration purposes, we'll add some names manually.
        names.add("Array");
        names.add("Added");
        names.add("And");
        names.add("Deleted");
    }

    public void searchName(String name) {
        // Method to search for a student by name
        if (names.contains(name)) {
            System.out.println(name + " found.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public void searchName(int index) {
        // Method to print student name at an index
        if (index >= 0 && index < names.size()) {
            System.out.println("Student at index " + index + ": " + names.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void printNames() {
        // Method to print all names using an iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeName(String stuName) {
        // Method to delete a name
        if (names.contains(stuName)) {
            names.remove(stuName);
            System.out.println(stuName + " removed.");
        } else {
            System.out.println(stuName + " not found.");
        }
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        // Set names
        student.setNames();

        // Search for a name
        student.searchName("Array");

        // Print name at an index
        student.searchName(2);

        // Print all names
        student.printNames();

        // Remove a name
        student.removeName("Deleted");

        // Print updated list of names
        student.printNames();
    }
}
