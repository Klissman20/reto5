/*
The natural number e can be calculated with this mathematical series: 
e = 1/ 0! + 1/ 1! + 1/ 2! + 1/ 3! + ⋯+ 1/ n! 
The precision of the number depends of the iterations in the series. 
Make a program that calculates the natural number e, 
given the precision requested by the user. 
Input: 
The line of input is an integer number  
Output: 
Will be the approximation the result of the number e 
 */
package reto5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Reto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        double e = 1;
        double factorial=1;
        int j=0;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el numero de precision: ");
        numero = lector.nextInt();
        for (int i=1;i<numero;i++){
            for (j=1;j<=i;j++){
                factorial*=j;
            }
            e += 1/factorial;
            factorial = 1;
        }
        System.out.println("e= "+e);
    }
    
}
