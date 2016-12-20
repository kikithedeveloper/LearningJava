/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataconversion;

/**
 *
 * @author kimberlylin
 */
public class DataConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println((3 + 5 +8)/3);
        System.out.println((3 + 5 +8)/3.0);
        // find out the volume of a sphere with radius 10
        double volume = 4/3 * Math.PI * 10*10*10;
        double real_volume = 4/3.0  * Math.PI * 10*10*10;
        System.out.println("The volume of a sphere with radius 10 is: " + volume);
        System.out.println("The real volume of a sphere with radius 10 is: " + real_volume);
        double fahrenheit = 500;
        double celsius = (fahrenheit - 32) * (5/9.0);
        System.out.println("Celsius is: " + celsius);
    }
    
}
