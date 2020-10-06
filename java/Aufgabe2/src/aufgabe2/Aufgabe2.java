/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aufgabe2;

/**
 *
 * @author admin
 */
public class Aufgabe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number = 10 + (Math.random()* 20);
        System.out.println("Es wurde die zhal" + number + "berchnet");
        if(number > 20) {
            System.out.println("Die berchnete zahl ist gr;sser als zwanzig");
        }else{ if (number == 20) {
            System.out.println("Die berchnete zhal ist kleiner als zwanzig");
        }
        }
    }
    
}
