/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7_mosinski;

import java.util.Comparator;

/**
 *
 * @author nmosinski
 */
public class StudentListings {
    
    // Declare private member variables. 
    private String name; 
    private int id_num;
    private double gpa;
    
    // default constructor
    StudentListings()
    {
        this.name = "";
        this.id_num = 0; 
        this.gpa = 0.0;
    }
    
    public StudentListings(String n, int id, double g)
    {
        this.name = n; 
        this.id_num = id; 
        this.gpa = g;
    }
    
    // Create an object of the craeter method
    public static Comparator<StudentListings> StuNameComparator = new Comparator<StudentListings >()
    {
        // Write the definition of the compare method. 
        public int compare(StudentListings s1, StudentListings s2)
        {
            // Store the name of both stduents in teh string variables
            String StudentName1 = s1.getName().toUpperCase();
            String StudentName2 = s2.getName().toUpperCase();
            
            return StudentName1.compareTo(StudentName2);
        }
    };

    // Private variable properties/accessor methods
    public String getName()
    {
        return name;
    }
    public void setName (String name) 
    {
        this.name = name;
    }
    
    public int getId_num()
    {
        return id_num;
    }
    public void setId_num(int id_num)
    {
        this.id_num = id_num;
    }
    
    public double getGPA()
    {
        return gpa;
    }
    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }
    
}
