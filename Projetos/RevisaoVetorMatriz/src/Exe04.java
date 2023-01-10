/*
 * 4) Faça um algoritmo com vetor de 5 posições que digite valores e informe quem são
 * múltiplos de 10
 */

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] valor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
                valor[i] = input.nextInt();
                
            if(valor[i]%10==0){
                System.out.println("É múltiplo de 10");
            }
        }
        
    }
    
}
