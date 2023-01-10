/*
 * 7) Faça um algoritmo que receba um número e diga se este número está no intervalo
 * entre 5 e 100.
 */

import java.util.Scanner;
        
public class Exe07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite um número: ");
            num = input.nextInt();
        
        System.out.println("----------------");
            
        if(num>5 && num<100){
            System.out.printf("O número %d está entre 5 e 100\n", num);
        }else{
            System.out.printf("O número %d não está entre 5 e 100\n", num);
        }
        
    }
    
}
