/*
 * 9) Receba um valor em mph (milhas por hora) e transforme em km\h. Ex: 60 mph retorna
 * 96.56 kmh
 */

import java.util.Scanner;

public class Exe09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float mph;
        
        System.out.printf("Digite a velocidade em mph (Milhas por hora): ");
            mph = input.nextFloat();
        
        System.out.println("----------------");
        
        System.out.printf("%f mph equivale à %f km\\h\n", mph, (mph*1.609));
        
    }
    
}
