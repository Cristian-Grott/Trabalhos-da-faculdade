/*
 * 7) Elabore um algoritmo que receba um vetor de 5 posições e retorne o produto
 * (multiplicação) total desses valores.
 */

import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] valor = new int[5];
        int produto=1;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
                valor[i] = input.nextInt();
                
                produto*=valor[i];
        }
        
        System.out.println("----------------");
        
        System.out.printf("O produto dos valores é %d\n", produto);
        
    }
    
}
