/*
 * 12) Um jogo de adivinhação:
 * a. Gerar um numero inteiro aleatório entre 1 e 10 (numero alvo).
 * b. Perguntar um valor para chute.
 * c. Informar se o valor chute é maior ou é menor que o numero alvo.
 * d. O jogo só para quando o numero alvo for adivinhado.
 */

import java.util.Scanner;
import java.util.Random;

public class Exe12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int num, aleat;
        
        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("Adivinhe o número aleatório de 1 a 10que o computador gerou");
        
        aleat = aleatorio.nextInt((10-1)+1)+1;
        
        do{
            System.out.print("Digite aqui o número: ");
            num = input.nextInt();
            
            if(num>aleat){
                System.out.println("Esse valor é maior que o número gerado");
            }else if(num<aleat){
                System.out.println("Esse valor é menor que o número gerado");
            }else{
                System.out.println("VOCÊ ACERTOU!!!");
            }
            
        }while(num!=aleat);
        
    }
    
}