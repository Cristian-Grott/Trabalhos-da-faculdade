/*
 * 8) Receba o valor de uma multa de transito e a quantidade de pontos na carteira do
 * condutor, caso o pontos na carteira sejam maiores que 10 a multa é acrescida de 15%.
 * Ex: multa 900 e pts 13, resposta 1035
 */

import java.util.Scanner;

public class Exe08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float multa;
        int pontos;
        
        System.out.print("Digite o valor da multa: ");
            multa = input.nextFloat();
        
        System.out.print("Digite a quantidade de pontos na carteira: ");
            pontos = input.nextInt();
        
        System.out.println("----------------");
        
        if(pontos<=10){
            System.out.printf("Multa: R$%.2f\n", multa);
        }else{
            System.out.printf("Multa: R$%.2f\n", multa*1.15);
        }
        
    }
    
}
