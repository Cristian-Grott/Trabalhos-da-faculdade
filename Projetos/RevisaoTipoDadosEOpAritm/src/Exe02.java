/*
 * 2) Receba três nomes e exiba os mesmos separando os por virgulas
 */

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String nome1, nome2, nome3;
        
        System.out.print("Digite um nome: ");
            nome1 = input.nextLine();
            
        System.out.print("Digite um nome: ");
            nome2 = input.nextLine();
            
        System.out.print("Digite um nome: ");
            nome3 = input.nextLine();
        
        System.out.println("----------------");
        
        System.out.printf("%s, %s, %s\n", nome1, nome2, nome3);

    }
    
}
