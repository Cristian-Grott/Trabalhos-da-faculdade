/*
 * 3) Faça um algoritmo que peça ao usuário a quantia em dinheiro que tem sobrando na
 * carteira e sugira, caso ele tenha 30 ou mais reais, que vá ao cinema, e se não tiver,
 * fique em casa vendo TV.
 */

import java.util.Scanner;

public class Exe03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float dinheiro;
        
        System.out.print("Quanto dinheiro tem sobrando na carteira: ");
            dinheiro = input.nextFloat();
        
        System.out.println("----------------");
        
        if(dinheiro>=30){
            System.out.println("Vá ao cinema!!! Avatar está em cartaz novamente");
        }else{
            System.out.println("Fique em casa para ver TV. Vai passar Velocidade máxima, com a Sandra Bullock");
        }
        
    }
    
}
