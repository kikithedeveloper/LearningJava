/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatelistings;

/**
 *
 * @author kimberlylin
 */
public class RealEstateListings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Property land = new Property(10000, "Land", 2.1);
        Property estate = new Property(250000, "Estate", 1.5, 3, 4);
        Property chi_property = new Property(25000, "Land", 12, 8, 26);
        System.out.println(land.toString());
        System.out.println(estate.toString());
        System.out.println(chi_property.toString());
    }
    
}
