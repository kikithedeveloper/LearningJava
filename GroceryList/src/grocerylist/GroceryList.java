/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerylist;
import java.util.Scanner;
/**
 *
 * @author kimberlylin
 */
public class GroceryList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] prices = new double[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 prices: ");
        prices[0] = in.nextDouble();
        prices[1] = in.nextDouble();
        prices[2] = in.nextDouble();
        prices[3] = in.nextDouble();
        prices[4] = in.nextDouble();
        double total = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
        System.out.printf("The total for all 5 prices is $%5.2f", total);
        System.out.println();
    }
    
}
