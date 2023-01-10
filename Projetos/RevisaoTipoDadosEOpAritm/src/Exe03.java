/*
 * 3) Receba o nome, sobrenome, sexo, RG e idade e posteriormente exiba as informações
 * na tela. Nome e sobrenome devem ser informados na mesma linha.
 */

import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nome, sobrenome, RG;
        
        System.out.print("Digite o seu nome: ");
            nome = input.nextLine();
        
        System.out.print("Digite o seu sobrenome: ");
            sobrenome = input.nextLine();
        
        System.out.print("Digite o seu RG: ");
            RG = input.nextLine();
            
        System.out.println("----------------");
        
        System.out.printf("Nome: %s %s\n", nome, sobrenome);
        System.out.println("RG: " +RG);
        
    }
    
}
