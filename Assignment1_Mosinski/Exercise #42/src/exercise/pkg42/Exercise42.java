/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg42;

/**
 *
 * @author nmosinski
 */
public class Exercise42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array of listings
        Listing[] listingArray;
        listingArray = new Listing[3];
        
        // iteratore through array to enter data
        for(int i = 0; i < listingArray.length; i++)
        {
            // Create a new listing for each array element
            listingArray[i] = new Listing();
            
            // input information for each listing element in array
            listingArray[i].input();
        }
        
        // Add a line between input and output
        System.out.println();
        
        // iterate through array to display data backwards
        for(int j = listingArray.length - 1; j >= 0; j--)
        {
            System.out.println(listingArray[j].toString());
        }
    }
    
}
