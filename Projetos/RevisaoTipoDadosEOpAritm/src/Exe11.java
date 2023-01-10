/*
 * 11) Escreva um algoritmo para ler o número total de eleitores de um município, o número
 * de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
 * representa em relação ao total de eleitores.
 */

import java.util.Scanner;

public class Exe11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float eleitores, brancos, nulos, validos;
        
        System.out.print("Digite o número de eleitores: ");
            eleitores = input.nextFloat();
        
        System.out.print("Digite o número de votos brancos: ");
            brancos = input.nextFloat();
        
        System.out.print("Digite o número de votos nulos: ");
            nulos = input.nextFloat();
        
        System.out.print("Digite o número de votos válidos: ");
            validos = input.nextFloat();
        
        System.out.println("----------------");
        
        System.out.printf("Total de eleitores: %.0f\n", eleitores);
        System.out.printf("Percentual de votos brancos: %.2f%%\n", (brancos*100)/eleitores);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", (nulos*100)/eleitores);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", (validos*100)/eleitores);
        
    }
    
}