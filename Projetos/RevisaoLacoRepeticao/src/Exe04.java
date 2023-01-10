/*
 * 4) Receba um valor de entrada X e retorne os valores múltiplos desse numero entre 0 a
 * 50. Ex: X = 15, resposta 15, 30, 45;
 */

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int X;
        
        System.out.print("Digite um número: ");
            X = input.nextInt();
        
        System.out.println("----------------");
        
        for (int i = X; i < 50; i+=X) {
            System.out.println(i);
        }
        
    }
    
}
