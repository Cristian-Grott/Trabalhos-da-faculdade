/*
 * 10) Ler um valor e realizar o calculo do fatorial do valor.
 */

import java.util.Scanner;

public class Exe10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, fatorial;
        
        System.out.print("Digite um número: ");
            num = input.nextInt();
            
            fatorial = num;
        
        for (int i = (num-1); i > 1; i--) {
            fatorial*=i;
        }
        
        System.out.println("----------------");
        
        System.out.printf("O fatorial de %d é %d\n", num, fatorial);
        
    }
    
}
