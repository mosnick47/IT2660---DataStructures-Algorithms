/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_mosinski_.pkg25;

/**
 *
 * @author nmosinski
 */
public class Assignment4_Mosinski_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentListings studentList = new StudentListings();
        
        studentList.input();
        
        System.out.println(studentList.toString());
        
        int nameKey = studentList.compareTo("Nick");
        
        studentList.deepCopy();
        
        if(nameKey == 0)
        {
            System.out.println("Nick is in the list!");
        }
        else
        {
            System.out.println("Nick IS NOT in the list!");
        }
    }    
}
