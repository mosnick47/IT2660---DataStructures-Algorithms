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
public class Stack {
    private Student[] data;
    private int top;
    private int size;
    
    public Stack(int n)
    {
        top = -1;
        size = 100;
        data = new Student[n];
    }
    
    public boolean push(Student newNode)
    {
        if(top == size - 1)
            return false;       // overflow error
        else
        {
            top = top + 1;
            data[top] = newNode.deepCopy();
            return true;    // push operation successful
        }        
    }
    
    public Student pop()
    {
        int topLocation;
        if(top == -1)
            return null;    // underflow error
        else
        {
            topLocation = top;
            top = top - 1;
            return data[topLocation];
        }
    }
    
    public void showAll()
    {
        for(int i = top; i >= 0; i--)
        {
            System.out.println(data[i].toString());
        }
    }
    
    // Method to reinitialize the stack to empty
    public Stack reinitializeStack(Stack studentStack, int n)
    {               
        for(int i = studentStack.top; i > 0; i--)
        {
            data[i] = null;     // sets each of the values of the array to null
        }
        
        return studentStack = new Stack(n);
    }
    
    // Check if the stack is empty or not
    public String emptyCheck(Stack studentStack)
    {
        if(studentStack.data[0] == null)
            return "The stack is empty. Fill stack with data to operate on stack.";
        else
            return "The stack IS NOT empty";
    }
    
    // Check if the stack is full or not
    public String fullCheck(Stack studentStack)
    {
        if(studentStack.data.length == (size - 1))
            return "The stack is full!";
        else
            return "The stack is not full";
    }
    
    // Method to peek at specific element
    public String peek(Stack studentStack, int peekPosition)
    {
        return "Stack Position #" + (peekPosition + 1) + ":\n" + studentStack.data[peekPosition].toString();
    }
}
