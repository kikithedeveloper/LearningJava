/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author kimberlylin
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// do while loop
        System.out.println("do while loop");
        int count = 0;
        do {
            System.out.println("looping");
            count++;
        } while (count < 3);
        
        // while loop
        System.out.println("while loop");
        count = 0;
        while (count < 3) {
            System.out.println("looping");
            count++;
        }
        
        // for loop
        System.out.println("for loop");
        count = 0;
        for (int i=0; i < 3; i++) {
            System.out.println("looping");
            count++;
        }
    }
    
}
