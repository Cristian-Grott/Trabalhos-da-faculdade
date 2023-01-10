/*
 * 1) Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
 * Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra
 * EMPATE.
 */

import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String time1, time2;
        int gol1, gol2;
        
        System.out.print("Digite o nome do primeiro time: ");
            time1 = input.nextLine();
        
        System.out.printf("Digite quantos gols o %s fez: ", time1);
            gol1 = input.nextInt();
            input.nextLine(); // Quebra de linha
        
        System.out.print("Digite o nome do segundo time: ");
            time2 = input.nextLine();
        
        System.out.printf("Digite quantos gols o %s fez: ", time2);
            gol2 = input.nextInt();
            
        System.out.println("----------------");
        
        if(gol1>gol2){
            System.out.printf("Vencedor: %s\n", time1);
        }else if(gol2>gol1){
            System.out.printf("Vencedor: %s\n", time2);
        }else{
            System.out.println("EMPATE!");
        }
        
    }
    
}
