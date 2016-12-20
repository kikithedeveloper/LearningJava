/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelcosts;
import java.util.Scanner;
/**
 *
 * @author kimberlylin
 */
public class TravelCosts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double distance;
        double mpg;
        double pricePerGallon;
        double totalCost;
        String vehicleType;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Enter the total mpg for your car: ");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        System.out.println("Please enter what type of vehicle: ");
        vehicleType = in.next();
        
        totalCost = (distance/mpg) * pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f since you are driving" 
                + " a " + vehicleType, totalCost);
        System.out.println();
    }
    
}
