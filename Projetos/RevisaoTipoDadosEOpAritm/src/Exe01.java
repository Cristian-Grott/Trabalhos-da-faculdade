/*
 * 1) Receba três nomes e exiba os mesmos na tela em linhas separadas.
 */

import java.util.Scanner;

public class Exe01 {

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
        
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome3);

    }
    
}
