
import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;
import jdk.nashorn.internal.runtime.NumberToString;
import java.util.Scanner;

public class Listing {
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
        Scanner scanner = new Scanner(System.in);

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
