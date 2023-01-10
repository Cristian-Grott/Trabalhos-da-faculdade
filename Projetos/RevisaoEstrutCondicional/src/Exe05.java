/*
 * 5) Receba 4 notas, calcule a média entre elas e retorne o conceito final do aluno. Ex:
 * Notas: 7,8,6,10, retorna B
 * a. Nota maior que 8,5 – Conceito A
 * b. Nota entre 7 e 8,5 – Conceito B
 * c. Nota entre 5 e 7 – Conceito C
 * d. Nota menor que 5 – Conceito D
 */

import java.util.Scanner;

public class Exe05 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float nota1, nota2, nota3, nota4, media;
        
        System.out.print("Digite a nota 1 do aluno: ");
            nota1 = input.nextFloat();
        
        System.out.print("Digite a nota 2 do aluno: ");
            nota2 = input.nextFloat();
        
        System.out.print("Digite a nota 3 do aluno: ");
            nota3 = input.nextFloat();
        
        System.out.print("Digite a nota 4 do aluno: ");
            nota4 = input.nextFloat();
            
        System.out.println("----------------");
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.printf("Media: %.1f\n", media);
        
        if(media>8.5){
            System.out.println("Conceito: A");
        }else if(media>7){
            System.out.println("Conceito: B");
        }else if(media>5){
            System.out.println("Conceito: C");
        }else{
            System.out.println("Conceito: D");
        }
        
    }
    
}
