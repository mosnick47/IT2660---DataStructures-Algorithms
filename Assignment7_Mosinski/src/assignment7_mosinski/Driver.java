/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7_mosinski;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nmosinski
 */
public class Driver {
    // Create scanner object
    static Scanner sc = new Scanner(System.in);
    
    private static int dataSetSize; 
    private static int initialSize;
    
    // Create array of StudentListings(students)
    static ArrayList<StudentListings> studentList = new ArrayList<StudentListings>();
    
    // method to search list
    // This method takes two parameters - the list to be searched, and the key value of the list
    public static int search(ArrayList<StudentListings> std, String name)
    {
        // Use for loop to search the objects. 
        for(int i = 0; i < std.size(); i++)
        {
            // if the student is present in the list, return the index value 
            // of the student object
            if(std.get(i).getName().compareTo(name) == 0)
                return i;
        }
        // return -1 if the object is not present in the list.
        return -1;
    }
    
    public void addData(StudentListings tmp)
    {
        studentList.add(tmp);
    }
    
    
    public static void setDataSetSize(int dataSetSize)            
    {
        Driver.dataSetSize = dataSetSize;
    }
    public static int getDataSetSize()
    {
        return Driver.dataSetSize;
    }
    
    public static void setInitialSize(int initialSize)
    {
        Driver.initialSize = initialSize;
    }
    public static int getInitialSize()
    {
        return initialSize;
    }

}
