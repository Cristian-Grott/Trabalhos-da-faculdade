/*
 * 7) Faça um algoritmo que receba a idade de 5 pessoas e mostre mensagem informando
 * "maior de idade" e "menor de idade" para cada pessoa. Considere a idade a partir de
 * 18 anos como maior de idade.
 */

import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int idade;
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a idade da %dº pessoa: ", (i+1));
                idade = input.nextInt();
            
            if(idade>=18){
                System.out.println("Maior de idade");
            }else{
                System.out.println("Menor de idade");
            }
        }
        
    }
    
}
