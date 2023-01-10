/*
 * 1) Crie um algoritmo onde o usuário entra com 10 nomes diferentes em um vetor.
 */

import java.util.Scanner;

public class Exe01 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] nomes = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° nome: ", (i+1));
                nomes[i] = input.nextLine();
        }
        
    }
    
}
