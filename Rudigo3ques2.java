/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rudigo3ques2;

/**
 *
 * @author USER
 */
public class Rudigo3ques2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2, b = 5, c = 10;
      add(a,b);
      add2(b, c);
      subtract(c, a); 
    }
    
     public static void add(int a, int b){
        
        int ab = a + b;
         System.out.println("The sum of a + b  is "+ ab);
            
    }

     public static void add2(int b, int c){
        
        int ab = b + c;
         System.out.println("The sum of b + c  is "+ ab);
            
    }
      public static void subtract(int c, int a){
        
        int ab = a + c;
         System.out.println("The difference of a + c  is "+ ab);
            
    }
    
}
