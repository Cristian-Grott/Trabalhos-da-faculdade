/*
 * 6) Declare cinco variáveis do tipo float, realize a soma e exiba na tela
 */

import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float a, b, c, d, e;
        
        a = 1.5f;
        b = 2.7f;
        c = 9.75f;
        d = 7.98f;
        e = 1.25f;
        
        System.out.println("Soma das variáveis declaradas: " +(a+b+c+d+e));
        
    }
    
}