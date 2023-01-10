/*
 * 8) Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
 * multiplicação e a divisão dos números lidos.
 */

import java.util.Scanner;

public class Exe08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float num1, num2;
        
        System.out.print("Digite um número: ");
            num1 = input.nextFloat();
            
        System.out.print("Digite outro número: ");
            num2 = input.nextFloat();
            
        System.out.println("----------------");
        
        System.out.printf("%f + %f = %f\n", num1, num2, (num1+num2));
        System.out.printf("%f - %f = %f\n", num1, num2, (num1-num2));
        System.out.printf("%f x %f = %f\n", num1, num2, (num1*num2));
        System.out.printf("%f / %f = %f\n", num1, num2, (num1/num2));
        
    }
    
}
