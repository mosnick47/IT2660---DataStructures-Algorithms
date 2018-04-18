/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7_mosinski;

import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author nmosinski
 */
public class Student {
    Scanner sc = new Scanner(System.in);
    
    Student()
    {
        System.out.println("Enter the maximum dataset size: ");
        Driver.setDataSetSize(sc.nextInt());
        
        System.out.println("Enter the intial size of the data set: ");
        Driver.setInitialSize(sc.nextInt());
        
        int size = Driver.getInitialSize();
        
        while(size > 0)
        {
            System.out.print("Enter Student Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Enter Student ID number: ");
            int id_num = sc.nextInt();
            
            System.out.print("Enter GPA: ");
            double gpa = Double.parseDouble(sc.next());
            
            // Create StudentListing object
            StudentListings tmp = new StudentListings(name, id_num, gpa);
            
            Driver driver = new Driver();
            driver.addData(tmp);
            
            size --;
        }
    }
    
    // display student info
    static void DisplaySortedList()
    {
        // Sort the array list called Student list. 
        Collections.sort(Driver.studentList, StudentListings.StuNameComparator);
        
        System.out.println("Names\t\tId_Number\tGPA");
        
        // print StudentListing details
        for(StudentListings student : Driver.studentList)
        {
            System.out.println(student.getName() + "\t\t" + student.getId_num() + "\t\t" + student.getGPA());
        }
    }
}
