/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise.pkg42;

import java.util.Scanner;

/**
 *
 * @author nmosinski
 */
public class Listing {
    
    // Scanner to get user input
    Scanner scanner = new Scanner(System.in);

    // instance variables
    private String name;
    private int age;

    // default constructor
    public Listing()
    {
        name = "";
        age = 0;
    }

    // Constructor with 2 arguments
    public Listing(String n, int a)
    {
        name = n;
        age = a;
    }

    // ToString method
    public String toString()
    {
        return "Name: " + getName() + "\nAge: " + getAge() + "\n";
    }

    // method that allows user to input new listing
    public void input()
    {

        System.out.println("Enter the name the listing:");
        setName(scanner.next());
        System.out.println("Enter the age the listing:");
        setAge(scanner.next());
    }

    // Mutator method for 'name' variable
    public void setName(String n)
    {
        name = n;
    }

    // Mutator method for 'age' variable
    public void setAge(String a)
    {
        age = Integer.parseInt(a);
    }

    // Get method for name
    public String getName()
    {
        return name;
    }

    // Get method for age
    public int getAge()
    {
        return age;
    }
}
