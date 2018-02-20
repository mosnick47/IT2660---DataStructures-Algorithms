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
public class Stack {
    private Student[] data;
    private int top;
    private int size;
    
    public Stack(int n)
    {
        top = -1;
        size = 3;       // *** Changed the max size to 3 for easier testing
        data = new Student[n];
    }
    
    public Stack push(Stack studentStack, Student newNode)
    {        
        if(top == size - 1)
        {
            size += 1;
            top += 1;
            Student[] tmp = studentStack.data;
            studentStack.data = new Student[size];
            for(int i = 0; i < size; i++)
            {
                                if(i == top)
                {
                    studentStack.data[i] = newNode;
                    break;                    
                }
                                
                studentStack.data[i] = tmp[i];                
            }             
            return studentStack;
        }
        else
        {
            top = top + 1;
            data[top] = newNode.deepCopy();
            return studentStack;    // push operation successful
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
    public Boolean fullCheck(Stack studentStack)
    {
        if(studentStack.data.length == (size - 1))
            return true;
        else
            return false;
    }
    
    // Method to peek at specific element
    public String peek(Stack studentStack, int peekPosition)
    {
        return "Stack Position #" + (peekPosition + 1) + ":\n" + studentStack.data[peekPosition].toString();
    }
}
