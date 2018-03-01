/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_mosinski_.pkg25;

import javax.swing.JOptionPane;

/**
 *
 * @author nmosinski
 */
public class StudentListings 
{
    // Class variables
    private String Name; 
    private int Id_Number;
    private double Gpa;    
    
    // Default Constructor
    public StudentListings()
    {
        Name = "";
        Id_Number = 0;
        Gpa = 0.0;
    }
    
    // ToString method
    public String toString()
    {
        return("Name is " + Name + "\nIdentification number is " + Id_Number + "\nGPA is " + Gpa + "\n");
    }
    
    // deepCopy method
    public StudentListings deepCopy()
    {
        StudentListings clone = new StudentListings();
        return clone;
    }
    
    // compareTo method - Takes a name as a parameter and check
    // the list to see if the name is in the list.
    // If the strings are equal, compareTo method returns zero!
    public int compareTo(String targetKey)
    {
        return(Name.compareTo(targetKey));
    }
    
    // input method
    public void input()           
    {
        Name = JOptionPane.showInputDialog("Enter the student's name: ");
        Id_Number = Integer.parseInt(JOptionPane.showInputDialog("Enter the student's ID: "));
        Gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter the student's GPA: "));
    }           
}