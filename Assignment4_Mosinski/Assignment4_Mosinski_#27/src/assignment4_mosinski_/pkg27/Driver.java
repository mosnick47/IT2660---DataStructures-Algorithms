/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_mosinski_.pkg27;

import java.util.Scanner;

/**
 *
 * @author nmosinski
 */
public class Driver {
    
    static Scanner indata = new Scanner(System.in);

    static int choice() 
    {
        System.out.println("1. insert data");

        System.out.println("2. fetch data");

        System.out.println("3. delete data");

        System.out.println("4. update data");

        System.out.println("5. output student data");

        System.out.println("6. exit the program");

        System.out.print("enter choice: ");


        return indata.nextInt();
    }
}
