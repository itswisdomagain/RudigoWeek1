/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rudigo3question44;

/**
 *
 * @author USER
 */
public class Rudigo3question44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84;
      System.out.println("My tuition:");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition:");
      tuitionBill(myCredits, rate);
    }

    public static void tuitionBill(int myCreditsq, double ratew) {
        System.out.println("Total due " + (myCreditsq*ratew));
    }
    
}
