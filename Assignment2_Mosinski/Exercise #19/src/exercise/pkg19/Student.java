/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package exercise.pkg19;
import javax.swing.JOptionPane;
/**
 *
 * @author nmosinski
 */

// Class that creates a single student
public class Student {
    
    // private members
    private String Name; 
    private int Id; 
    private double Gpa;
    
    // default constructor
    public Student()
    {
        Name = "";
        Id = 0;
        Gpa = 0.0;
    }
    
    // Constructor with all 3 paramters
    public Student(String name, int Id, double Gpa)
    {
        this.Name = name;
        this.Id = Id;
        this.Gpa = Gpa;
    }
            
    
    // toString() method
    public String toString()
    {
        return "Name is " + Name + "\nIdentification number is " + Id + "\nGPA is " + Gpa + "\n";
    }
    
    // deepCopy method
    public Student deepCopy()
    {
        Student clone = new Student();
        return clone;
    }
    
    // compareTo method -- compareTo() is used for comparing two string. Each character of both strings
    // is converted into unicode value for comparison. If the strings are equal, the method returns 0.
    // If they are not equal, the method returns positive or negative values depending on the strings.
    public int compareTo(String targetKey)
    {
        return(Name.compareTo(targetKey));
    }
    
    // input method
    public void input()
    {
        Name = JOptionPane.showInputDialog("Enter student's name");
        Id = Integer.parseInt(JOptionPane.showInputDialog("Enter student's ID"));
        Gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter sudent's GPA"));
    }
    
    public void setName(String name)
    {
        this.Name = name;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public void setId(int id)
    {
        this.Id = id;
    }
    
    public int getId()
    {
        return Id;
    }
    
    public void setGpa(double gpa)
    {
        this.Gpa = gpa;
    }
    
    public double getGpa()
    {
        return Gpa;
    }
    
    
    
    
    
    
    
    
    
}
