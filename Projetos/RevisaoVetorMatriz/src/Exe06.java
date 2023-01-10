/*
 * 6) Elabore um algoritmo que receba um vetor de 5 posições e retorne a soma total
 * desses valores
 */

import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] valor = new int[5];
        int soma=0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
                valor[i] = input.nextInt();
                
                soma+=valor[i];
        }
        
        System.out.println("----------------");
        
        System.out.printf("A soma dos valores é %d\n", soma);
        
    }
    
}
