/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6_mosinski;

/**
 *
 * @author nmosinski
 */
public class Assignment6_Mosinski {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = new int[100]; 
        
        // fill array with random elements 
        assignment6_mosinski.Merge.fill(data);
        
        // display the array
        assignment6_mosinski.Merge.display(data);
        
        // call mergesort function
        assignment6_mosinski.Merge.mergeSort(data, 0, 99);
        
        // display sorted array
        assignment6_mosinski.Merge.display(data);
    }
    
}
