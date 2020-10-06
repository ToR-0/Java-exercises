/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aufgabe5;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Aufgabe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner("System.in");
        System.out.println("Enter  a number:");
        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();
        System.out.print("you Entered: " + number);
    }
    
}
