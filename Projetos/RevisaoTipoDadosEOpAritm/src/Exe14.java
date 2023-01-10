/*
 * 14) Faça um algoritmo que receba o preço de custo de um produto, a quantidade em
 * estoque e uma taxa de lucro em %. Informe qual será o lucro caso todo estoque seja
 * vendido.
 */

import java.util.Scanner;

public class Exe14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float precoCusto, estoque, taxaLucro;
        
        System.out.print("Digite o preço de custo do produto: ");
            precoCusto = input.nextFloat();
        
        System.out.print("Digite a quantidade no estoque: ");
            estoque = input.nextFloat();
            
        System.out.print("Digite o percentual (%) de lucro em cima do produto: ");
            taxaLucro = input.nextFloat();
        
        System.out.println("----------------");
        
        System.out.printf("Lucro caso todo o estoque seja vendido: R$%.2f\n", (((taxaLucro/100)*precoCusto)*estoque));
        
    }
    
}
