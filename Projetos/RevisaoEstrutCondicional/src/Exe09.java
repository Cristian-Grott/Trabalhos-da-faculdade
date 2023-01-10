/*
 * 9) Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
 * que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * a. Para homens: (72.7*h) - 58
 * b. Para mulheres: (62.1*h) - 44.7 (h = altura)
 * c. Peça o peso da pessoa e informe se ela está acima ou abaixo do peso.
 */

import java.util.Scanner;

public class Exe09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float altura, pesoIdeal;
        String sexo;
        
        System.out.print("Digite a altura: ");
            altura = input.nextFloat();
            input.nextLine();
        
        System.out.print("Digite o sexo [M/F]: ");
            sexo = input.nextLine();
            
        System.out.println("----------------");
            
        if(sexo.equalsIgnoreCase("M")){
            pesoIdeal = (72.7f*altura)-58;
            System.out.printf("Seu peso ideal é %.3f\n", pesoIdeal);
            
        }else if(sexo.equalsIgnoreCase("F")){
            pesoIdeal = (62.1f*altura)-44.7f;
            System.out.printf("Seu peso ideal é %.3f\n", pesoIdeal);
            
        }else{
            System.out.println("Opção inválida");
            
        }
    }
    
}
