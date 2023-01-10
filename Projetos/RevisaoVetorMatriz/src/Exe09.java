/*
 * 9) Elabore um algoritmo que informe os valores contidos em uma matriz 4 linhas x 4
 * colunas e realize a soma total dos valores existentes.
 */

import java.util.Scanner;

public class Exe09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] valor = new int[4][4];
        int soma=0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um valor: ");
                    valor[i][j] = input.nextInt();
                    soma+=valor[i][j];
            }
        }
        
        System.out.println(" ---------------");
        
        for (int i = 0; i < 4; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %d |", valor[i][j]);
            }
            System.out.println("");
            System.out.println(" ---------------");
        }
        
        System.out.printf("A soma dos valores é %d\n", soma);
        
    }
    
}
