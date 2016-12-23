/*
 * This challenge computes and displays the total charges for a hospital stay
 * The patient might be admitted overnight.  For an overnight stay, we need: 
 *   The number of days spent in the hospital
 *   The daily rate
 *   Medication charges
 *   Lab service charges
 * If it is not overnight, we only need: 
 *   Medication charges
 *   Lab service charges
 */
package hospitalstaychallenge;
import java.util.Scanner;
/**
 *
 * @author kimberlylin
 */
public class HospitalStayChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String response = "";
        double hospitalCharge = 0;
        double medCharge = 0;
        double labCharge = 0;
        
        do{
            hospitalCharge = getTotalHospitalCost();
            System.out.println("Enter the medication charges: ");
            medCharge = in.nextDouble();
            System.out.println("Enter the lab service charges: ");
            labCharge = in.nextDouble();
            System.out.println("The total cost is " + (hospitalCharge + medCharge + labCharge));
            System.out.println("Do you have another patient? y or n");
            response = in.next();
        } while (response.equalsIgnoreCase("y"));
    }
    
    public static double getTotalHospitalCost() {
        Scanner in = new Scanner(System.in);
        int numOfDay;
        double dailyRate;
        System.out.println("Did the patient stay overnight? y or n");
        String isOvernight = in.nextLine();
        if ("y".equals(isOvernight))
        {
            System.out.println("How many night(s) did the patient stay? ");
            numOfDay = in.nextInt();
            System.out.println("Enter the daily rate: ");
            dailyRate = in.nextDouble();
            return numOfDay * dailyRate;
        } 
        return 0;
    }
    
}
