/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_mosinski_.pkg26;

/**
 *
 * @author nmosinski
 */
public class Node<T> implements Comparable<T> 
{
    private T value; 
    private Node<T> nextRef;
    
    public T getValue()
    {
        return value;
    }
    
    public void setValue(T value)
    {
        this.value = value;
    }
    
    public Node<T> getNextRef()
    {
        return nextRef;
    }
    
    public void setNextRef(Node<T> ref)
    {
        this.nextRef = ref;
    }
    
    public int compareTo(T arg)
    {
        if(arg == this.value)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
