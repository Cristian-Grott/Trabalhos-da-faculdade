/*
 * 2) Faça um algoritmo cuja função seja preencher um vetor de tamanho 10 utilizando o
 * comando de entrada de dados da linguagem (usuário entra com o valor). Em seguida
 * escreva os valores contidos no vetor.
 */

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] valor = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um valor para a posição %d: ", i);
                valor[i] = input.nextInt();
        }
        
        System.out.println("----------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Posição [%d] = %d\n", i, valor[i]);
        }
        
    }
    
}
