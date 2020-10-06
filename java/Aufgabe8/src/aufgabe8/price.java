/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aufgabe8;
import java.util.HashMap;
import static javax.management.Query.value;

/**
 *
 * @author admin
 */
public class price {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //creat a HashMap
        HashMap <String, Integer> prices = new HashMap<>();
        //** insert entries to the HashMap
        price.Put("shoes", 200);
        price.put("Bag", 230);
        price.put("pant", 150);
        System.out.println("normal price: " + price);
        System.out.println("Discount price");
        // pass lambda expression to forEach()
        Price.forEach((key, value)) ->{
        // decrease value by 10%
        valu = value - value * 10/100;
        System.out.print(key +"=" +value +" ");
    });
  }
}