/*
 * 5) Elabore um algoritmo que receba um vetor de 5 posições e escreva os números
 * ímpares, e indique em quais posições eles se encontram.
 */

import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] valor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
                valor[i] = input.nextInt();
        }
        
        System.out.println("----------------");
        
        for (int i = 0; i < 5; i++) {
            if(valor[i]%2==1){
                System.out.printf("Posição [%d] = %d\n", i, valor[i]);
            }
        }

    }
    
}
