/*
 * 7) Faça um algoritmo que receba dois números e exiba o resultado da sua soma
 */

import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Digite um número: ");
            num1 = input.nextInt();
            
        System.out.print("Digite outro número: ");
            num2 = input.nextInt();
            
        System.out.println("----------------");
            
        System.out.printf("A soma de %d e %d é %d\n", num1, num2, (num1+num2));
        
    }
    
}
