/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment6_mosinski;

import java.util.Random;

/**
 *
 * @author nmosinski
 */
public class Merge {
    public static void fill(int array[])
    {
        // fill array with random elements
        Random gen = new Random();
        
        for (int i = 0; i < array.length; i++)
        {
            array[i] = gen.nextInt();
        }
    }
    
    public static void display(int arr[])
    {
        System.out.println("The elements of the array are: ");
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println();
    }
    
    public static void merge(int data[], int low, int mid, int high)
    {
        int first = mid; 
        int second = mid + 1; 
        int l = low;
        
        while((l <= first) && (second <= high))
        {
            if(data[low] < data[second])
            {
                low++;
            }
            else
            {
                int temp = data[second]; 
                
                for (int j = second - 1; j >= low; j--)
                {
                    data[j + 1] = data[j];
                }
                
                data[low] = temp; 
                low++; 
                first++;
                second++; 
            }
        }               
    }
    
    public static void mergeSort(int data[], int low, int high)
    {
        // best case 
        if(low >= high)
        {
            return;
        }
        
        int mid = (low + high)/2;
        
        // divide list
        mergeSort(data, low, mid);
        mergeSort(data, mid + 1, high);
        
        //merge sort and sort the divded lists
        merge(data, low, mid, high);        
    }
    
}
