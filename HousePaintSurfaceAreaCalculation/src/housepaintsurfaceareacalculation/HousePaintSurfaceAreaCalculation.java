/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housepaintsurfaceareacalculation;
import java.util.Scanner;
/**
 *
 * @author kimberlylin
 */
public class HousePaintSurfaceAreaCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double height;
        double width;
        double length;
        double windowNum;
        double windowHeight;
        double windowWidth;
        double doorNum;
        double doorHeight;
        double doorWidth;
        
        System.out.println("What is the height, width, and length of the house?");
        height = in.nextDouble();
        width = in.nextDouble();
        length = in.nextDouble();
        
        System.out.println("What is the number, height, and width of windows?");
        windowNum = in.nextDouble();
        windowHeight = in.nextDouble();
        windowWidth = in.nextDouble();
        
        System.out.println("what is the number, height, and width of doors?");
        doorNum = in.nextDouble();
        doorHeight = in.nextDouble();
        doorWidth = in.nextDouble();

        double surfaceArea = (height * width * 2 + length * height * 2) 
                - (windowNum * windowHeight * windowWidth + doorNum * doorHeight * doorWidth);
        
        System.out.printf("The total surface area of the house is %5.2f", surfaceArea);
        
        System.out.println();
        
    }
    
}
