/*
 * 12) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e
 * mês com 30 dias.

 */

import java.util.Scanner;

public class Exe12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int ano, mes, dia;
        
        System.out.print("Digite quantos anos você tem: ");
            ano = input.nextInt();
            
        System.out.print("E quantos meses a partir do seu aniversário: ");
            mes = input.nextInt();
        
        System.out.print("Digite quantos dias: ");
            dia = input.nextInt();
            
        System.out.println("----------------");
        
        System.out.printf("Você tem %d dias de vida\n", ((ano*365)+(mes*30)+dia));
        
    }
    
}
