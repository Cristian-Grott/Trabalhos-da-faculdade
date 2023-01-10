/*
 * 8) Elabore um algoritmo que informe os valores contidos em uma matriz 2 linhas x 3
 * colunas.
 */

import java.util.Scanner;

public class Exe08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] valor = new int[2][3];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um valor: ");
                    valor[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.print("| ");
            
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d | ",valor[i][j]);
            }
            
            System.out.println("");
            System.out.println(" -----------");
        }
        
    }
    
}
