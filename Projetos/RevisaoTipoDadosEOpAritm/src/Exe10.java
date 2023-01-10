/*
 * 10) Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
 * fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
 */

import java.util.Scanner;

public class Exe10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float distancia, combustivel;
        
        System.out.print("Digite a distância (Km) percorrida: ");
            distancia = input.nextFloat();
        
        System.out.print("Digite a quantidade de combustível (Litro) gasto: ");
            combustivel = input.nextFloat();
        
        System.out.println("----------------");
        
        System.out.printf("Consumo médio de combustível: %.3f Km\\L\n", (distancia/combustivel));
        
    }
    
}
