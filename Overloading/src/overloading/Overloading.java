/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author kimberlylin
 */
public class Overloading {

    public static void main(String[] args) {
        
        System.out.println("The average of three integers: 3, 5, 8 is: "+
                average(3,5,8));
        System.out.println("The average of three doubles: 4.0, 6.0, 18.0 is: "+
                average(4.0, 6.0, 18.0));
        
    }
   public static double average(int x, int y, int z)
   {
       return (x + y + z)/3.0;
   }
   public static double average(double x, double y, double z)
   {
       return (x + y + z)/3;
   }
}
