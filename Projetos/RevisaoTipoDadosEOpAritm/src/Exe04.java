/*
 * 4) Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a
 * variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
 * variável A. Apresentar os valores trocados.
 */

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int A, B, C;
        
        System.out.print("Digite um valor para A: ");
            A = input.nextInt();
        
        System.out.print("Digite um valor para B: ");
            B = input.nextInt();
        
        System.out.println("----------------");
        
        System.out.printf("A = %d\n", A);
        System.out.printf("B = %d\n", B);
        
        System.out.println("----------------");
        
        System.out.println("Trocando os valores");
        
        C = A;
        A = B;
        B = C;
        
       System.out.println("----------------");
       
       System.out.printf("A = %d\n", A);
       System.out.printf("B = %d\n", B);

    }
    
}
