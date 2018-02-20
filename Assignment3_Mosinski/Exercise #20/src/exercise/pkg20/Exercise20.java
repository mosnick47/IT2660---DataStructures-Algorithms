/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg20;

/**
 *
 * @author nmosinski
 */
public class Exercise20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack studentStack = new Stack(3);
        
        // Create student objects
        Student nick = new Student("Nick", 1, 3.5);
        Student frank = new Student("Frank", 2, 3.0);
        Student john = new Student("John", 4, 2.0);
        Student zack = new Student("Zack", 13, 3.7);
        Student sam = new Student("Sam", 3, 4.0);
        
        // Push student objects onto stack
        studentStack.push(studentStack, nick);
        studentStack.push(studentStack, frank);
        studentStack.push(studentStack, john);
        studentStack.showAll();
        System.out.println("\n======================================================================\n");
        // If the change to the push method was successful, 
        // this next push for sam should dynamically increase
        // the size of the stack.
        studentStack.push(studentStack, sam);
        
        studentStack.showAll();
        System.out.println("\n======================================================================\n");
        
        studentStack.push(studentStack, zack);
        
        studentStack.showAll();
        
        
    }
    
}
