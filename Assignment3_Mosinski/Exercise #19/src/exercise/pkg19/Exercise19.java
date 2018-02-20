/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg19;

/**
 *
 * @author nmosinski
 */
public class Exercise19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();        
        
        Stack studentStack = new Stack(10);     // Initialize stack with 10 Student records
        
        System.out.println(studentStack.emptyCheck(studentStack));      // Test emptyCheck method
        
        System.out.println("Student Stack:");
        
        // Initializing 5 students
        Student nick = new Student("Nick", 1, 3.5);
        Student frank = new Student("Frank", 2, 3.0);
        Student john = new Student("John", 4, 2.0);
        Student zack = new Student("Zack", 13, 3.7);
        Student sam = new Student("Sam", 3, 4.0);
        
        // Pushing 5 students to the stack
        studentStack.push(nick);
        studentStack.push(frank);
        studentStack.push(john);
        studentStack.push(zack);
        studentStack.push(sam);
        
        // Display students - Test peek method
        System.out.println("\nAdding 5 students to the stack:");       
        System.out.println(studentStack.peek(studentStack, 4));
        System.out.println(studentStack.peek(studentStack, 3));
        System.out.println(studentStack.peek(studentStack, 2));
        System.out.println(studentStack.peek(studentStack, 1));
        System.out.println(studentStack.peek(studentStack, 0));
        
        // A little formatting
        System.out.println("===================================================================");
        System.out.println("\nStack after pop method:\n");
        
        studentStack.pop();
        
        studentStack.showAll(); // There should be 1 less in the stack (Sam should have been removed)
        
        // Test the fullCheck method
        System.out.println(studentStack.fullCheck(studentStack)); 
        
        // Clear stack and re-initialize
        studentStack = studentStack.reinitializeStack(studentStack, 10);  
                
        // Check whether the stack is empty (if the reinialize method worked correctly,
        // the stack should be empty at this point).
        System.out.println(studentStack.emptyCheck(studentStack));                
    }    
}
