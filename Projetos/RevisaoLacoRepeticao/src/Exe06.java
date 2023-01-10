/*
 * 6) Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. 
 */

import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, negativo=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", (i+1));
                num = input.nextInt();
            
            if(num<0){
                negativo++;
            }
        }
        
        System.out.println("----------------");
        
        System.out.printf("Foram digitados %d números negativos\n", negativo);
        
    }
    
}
