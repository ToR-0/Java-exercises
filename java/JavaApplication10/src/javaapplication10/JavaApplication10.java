/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**set input to get the degree in fahrenheit */
        Scanner input = new Scanner(System.in);
        /** get from user degree in fahrenheit*/
        System.out.println("Input a degree in Fahrenheit:");
        /** make variable to get next degree fahrenheit*/
        double fahrenheit = input.nextDouble();
        /**celsius = ((5*(fahrenheit-32.0))/9.0*/
        double celsius =((5*(fahrenheit - 32.0))/9.0);
        
        /**print the result  */
        System.out.println(fahrenheit+"degree Fahrenheit is equal to" + celsius+ "in celsius");
        
        
    }
    
}
