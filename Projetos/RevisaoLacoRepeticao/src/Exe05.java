/*
 * 5) Faça um algoritmo que leia 10 números e ao final informar quantos números estão no
 * intervalo entre 10 e 150.
 */

import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, intervalo=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", (i+1));
                num = input.nextInt();
            
            if(num>10 && num<150){
                intervalo++;
            }
        }
        
        System.out.println("----------------");
        
        System.out.printf("Foram digitados %d números entre 10 e 150\n", intervalo);
        
    }
    
}
