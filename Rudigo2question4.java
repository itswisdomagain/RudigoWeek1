/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rudigo2question4;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Rudigo2question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String costString;
      double cost;
      final double TAX = 0.06;
      costString = JOptionPane.showInputDialog(null,"Enter price of item you are buying", "Purchases",
         JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
         "% tax,  purchase  is $" + (cost - cost * TAX));
    }
    
}
