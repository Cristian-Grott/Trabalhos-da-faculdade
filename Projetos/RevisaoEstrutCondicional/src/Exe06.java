/*
 * 6) Faça um programa que receba um número e informe se o mesmo é positivo, zero ou
 * negativo. Informar também se o numero é par ou impar.
 */

import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite um número: ");
            num = input.nextInt();
        
        System.out.println("----------------");
        
        if(num<0){
            System.out.println("É negativo");
        }else if(num==0){
            System.out.println("É zero");
        }else{
            System.out.println("É positivo");
        }
            
        if(num!=0){
            if(num%2==0){
                System.out.println("É par");
            }else{
                System.out.println("É impar");
            }
        }
        
    }
    
}
