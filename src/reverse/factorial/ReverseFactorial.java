/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.factorial;

import java.util.Scanner;

/**
 *
 * @author abbythomas
 */
public class ReverseFactorial {

    /** Reverse Factorial
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       double number, copyNum, counter = 1;
       out("Enter the number to check the reverse factorial.");
       number = kb.nextDouble();
       copyNum = number;
       while (number != 1 ) {
           number = number/counter;
           counter++;
           if (number%1 != 0)
           {
               break;
           }
       }
       if (number%1 != 0)
       {
           out((int)copyNum + " = NONE");
       }
       else
       {
          out((int)copyNum + " = " + (int)(counter-1) + "!"); 
       }
    }
    
    public static void out (String uInp) {
        System.out.println(uInp);
    }
    
}
    
