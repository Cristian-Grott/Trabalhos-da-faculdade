/*
 * 11) Um algoritmo que retorne o N-ésimo termo da série de fibonacci.
 */

import java.util.Scanner;

public class Exe11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a=1, b=0, aux, num;
        
        System.out.print("Informe qual posição da série de Fibonacci você quer saber: ");
            num = input.nextInt();
            
        System.out.println("----------------");
            
        for (int i = 1; i <= num; i++) {
            
            if(i==num){
                System.out.println(a);
            }
            
            aux = a;
            a = a+b;
            b = aux;
            
        }
        
        
        
    }
    
}
