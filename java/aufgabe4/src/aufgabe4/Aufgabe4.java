/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aufgabe4;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Aufgabe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input  = new Scanner (System.in);
    System.out.println("input your first number: ");
    int num1 = input.nextInt();
    System.out.println("input your second number");
    int num2 = input.nextInt();
    int sum = num1 + num2;
    System.out.println();
    System.out.println("Sum: "+sum);
    
    }
    
}
