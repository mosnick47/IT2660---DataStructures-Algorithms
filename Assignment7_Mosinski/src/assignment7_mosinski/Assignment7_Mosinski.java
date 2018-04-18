/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7_mosinski;

import java.util.Scanner;
/**
 *
 * @author nmosinski
 */
public class Assignment7_Mosinski {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        Start: while(true)
        {
            System.out.println("1 to insert a new students information");
            System.out.println("2 to fetch and output a student's information");
            System.out.println("3 to dleete a student's information");
            System.out.println("4 to update a student's information");
            System.out.println("5 to output all the studnet information in sorted order");
            System.out.println("6 to exit the program.");
            
            int n = sc.nextInt();
            
            // Check conditions with switch statements 
            switch(n)
            {
                case 1:
                {
                    // check the size of the array list.
                    if(Driver.studentList.size() >= Driver.getDataSetSize())
                    {
                        System.out.println("Cannot add the item to the list.");
                        continue;
                    }
                    System.out.print("Enter Student's name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Student ID number: ");
                    int id_num = sc.nextInt();
                    
                    System.out.print("Enter gpa: ");
                    double gpa = Double.parseDouble(sc.next());
                    
                    boolean key = false;
                    for(StudentListings stu : Driver.studentList)
                    {
                        if(stu.getName().equals(name))
                        {
                            key = true;
                            
                            break;
                        }
                        else
                        {
                            continue;
                        }
                    }
                    
                    if(key)
                    {
                        System.out.println("student already exists in the dataset");
                        break;
                    }
                    else
                    {
                        // create student object
                        StudentListings tmp = new StudentListings(name, id_num, gpa);

                        Driver.studentList.add(tmp);
                    }
                    
                    break;
                }
                
                // fetch the details of a student
                case 2: 
                {
                    System.out.print("Enter the Student's Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    int index = Driver.search(Driver.studentList, name);
                    if(index == 1)
                    {
                        System.out.println("That student does not exist");
                    }
                    else
                    {
                        System.out.println("----- STUDENT INFORMATION -----");
                        
                        System.out.println("Name: " + Driver.studentList.get(index).getName());
                        System.out.println("ID: " + Driver.studentList.get(index).getId_num());
                        System.out.println("GPA: " + Driver.studentList.get(index).getGPA());                        
                    }
                    break;
                }
                
                // Delete a student 
                case 3: 
                {
                    System.out.print("Enter Student's Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    int index = Driver.search(Driver.studentList, name);
                    
                    if(index == 1)
                    {
                        System.out.println("That student does not exist");
                    }
                    else
                    {
                        Driver.studentList.remove(index);
                        System.out.println("Student successfully removed!");
                    }
                }
                
                // Update all of the details for a student
                case 4: 
                {
                    System.out.print("Enter Student's Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    int index = Driver.search(Driver.studentList, name);
                    
                    if(index == 1)
                    {
                        System.out.println("That student does not exist");                        
                    }
                    else
                    {
                        System.out.print("Enter Student ID number: ");
                        int id_num = sc.nextInt();
                        
                        System.out.print("Enter gpa: ");
                        double gpa = Double.parseDouble(sc.next());
                        
                        Driver.studentList.get(index).setName(name);
                        Driver.studentList.get(index).setId_num(id_num);
                        Driver.studentList.get(index).setGPA(gpa);                        
                    }
                    break;                 
                }
                // Display all students in sorted order
                case 5: 
                {
                    Student.DisplaySortedList();
                    break;               
                }
                default: 
                    break Start;
            }
        }        
    }    
}
