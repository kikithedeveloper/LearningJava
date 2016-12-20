/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;
import java.util.Random;
/**
 *
 * @author kimberlylin
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int die1, die2, countDoubles = 0;
        Random rand = new Random();
        for (int i=0; i < 100; i++) 
        {
            die1 = rand.nextInt(6)+1;
            System.out.println(die1);
            die2 = rand.nextInt(6)+1;
            System.out.println(die2);
            if (die1 == die2) 
            {
                countDoubles++;
            }
            
        }
        System.out.println("Rolled " + countDoubles + " doubles");
    }
    
}
