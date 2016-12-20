/*
 * Make a program to determine shipping costs
 * Shipping rates:
 * Over $75, free
 * Between $50 and $75, cost is $15
 * Over $25 but less than $50 is $10
 */
package calculateshipping;
import java.util.Scanner;
/**
 *
 * @author kimberlylin
 */
public class CalculateShipping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalSale = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total for the sale: ");
        totalSale = in.nextDouble();
        if (totalSale < 25) 
        {
            totalSale += 15;
        }
        else if (totalSale < 50)
        {
            totalSale += 10;
        }
        else if (totalSale < 75)
        {
            totalSale += 5;
        }
        System.out.println("Total cost for your sale is: " + totalSale);
    }
    
}
