/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aufgabe3;

/**
 *
 * @author admin
 */
public class Aufgabe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 1 + (int)(Math.random() *6);
        switch(number){
            case 3:
        System.out.println("Gewonnen , du hast eine 3 gewürfelt.");
        break;
            case 4:
            case 5:
            case 6:
               System.out.println("Du hast eine" + number + "gewürfelt");
                break;
        default:
             System.out.println("Leider verloren, du hast eine " number + "gewürfelt.");
        }
    }
}
