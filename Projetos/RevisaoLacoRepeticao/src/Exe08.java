/*
 * 8) Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior
 * a 40 devem ser somados. Escreva o valor final da soma efetuada.
 */

import java.util.Scanner;

public class Exe08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, soma=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", (i+1));
                 num = input.nextInt();
                
            if(num<40){
                soma+=num;
            }
                
        }
        
        System.out.println("----------------");
        
        System.out.printf("A soma dos valores menores que 40 é %d\n", soma);
        
    }
    
}
