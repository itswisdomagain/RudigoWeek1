
package rudigo3question4;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Rudigo3question3 {
    //public String name;
    
    public static void main(String[] args) {
      
      displayGreeting(getName());
      
      
    }

    public static String getName() {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        name = input.nextLine();
        
        return name;
      
    }

    public static void displayGreeting(String name) {
        
        System.out.println("Hello " + name + "!");
        
        
        
    }
    
}
