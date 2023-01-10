/*
 * 13) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual
 * de reajuste. Calcular e escrever o valor do novo salário
 */

import java.util.Scanner;

public class Exe13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float salario, reajuste;
        
        System.out.print("Digite o salário do funcionário: ");
            salario = input.nextFloat();
        
        System.out.print("Digite o percentual (%) de reajuste: ");
            reajuste = input.nextFloat();
        
        System.out.println("----------------");
        
        System.out.printf("Salário reajustado: %.2f\n", (salario*(1+(reajuste/100))));
        
    }
    
}
