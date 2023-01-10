/*
 * 3) Faça um algoritmo com um vetor de tamanho 5 onde somente é permitido inserir
 * valores maiores que 0 e menores que 10.
 */

import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] valor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor entre 0 e 10: ");
            
            do{
                valor[i] = input.nextInt();
                
                if(valor[i]<=0 || valor[i]>=10){
                    System.err.println("DIGITE UM VALOR VÁLIDO!");
                }
                
            }while(valor[i]<=0 || valor[i]>=10);
        }
        
        
        
    }
    
}
