/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg21;

/**
 *
 * @author nmosinski
 */

// Creates a couple of student listing arrays, inserts some values and displays, then deletes some values and display
public class Exercise21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Student List 1:");
        StudentListing listing1 = new StudentListing(new Student("Nick", 1, 3.5));
        listing1.insert(new Student("Frank", 2, 3.0), 1);
        listing1.insert(new Student("Sam", 3, 4.0), 2);
        listing1.insert(new Student("John", 4, 2.0), 3);
        listing1.insert(new Student("Zack", 13, 3.7), 4);
        listing1.print();
        
        System.out.println();
        System.out.println("Student List 2:");
        StudentListing listing2 = new StudentListing(new Student("Adam", 5, 2.2));
        listing2.insert(new Student("James", 6, 3.3), 1);
        listing2.insert(new Student("Simon", 7, 2.9), 2);
        listing2.insert(new Student("Jack", 8, 1.8), 1);        // Jack and Wanda will bump James and Simon down to 
        listing2.insert(new Student("Wanda", 9, 2.5), 2);       // postions 3 and 4 and take 1 and 2        
        listing2.print();
        
        System.out.println();
        System.out.println("Remove students from List 1:");
        listing1.delete(1);
        listing1.delete(4);
        listing1.print();
        
        System.out.println();
        System.out.println("Remove students from List 2:");
        listing2.delete(4);
        listing2.delete(0);                      
        listing2.print();
    }
    
}
