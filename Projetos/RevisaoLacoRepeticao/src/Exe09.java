/*
 * 9) Crie um algoritmo que o usuário entre com vários números inteiros e positivos e
 * imprima o produto dos números ímpares e a soma dos números pares. 
 */

import java.util.Scanner;

public class Exe09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, prod=1, soma=0;
        String flag;
        
        do{
            System.out.print("Digite um número inteiro e positivo: ");
            
            
            do{
                num = input.nextInt();
                input.nextLine();
                    
                if(num<=0){
                    System.err.println("DIGITE UM NÚMERO VÁLIDO!!!");
                }
            }while(num<=0);
            
            
            if(num%2==0){
                soma+=num;
            }else{
                prod*=num;
            }
            
            
            System.out.print("Digitar mais um número [S/N]: ");
            
            
            do{
                flag = input.nextLine();
                
                if((!flag.equalsIgnoreCase("S")) && (!flag.equalsIgnoreCase("N"))){
                    System.err.println("DIGITE UMA OPÇÃO VÁLIDA!!!");
                }
            }while((!flag.equalsIgnoreCase("S")) && (!flag.equalsIgnoreCase("N")));
            
            
        }while(flag.equalsIgnoreCase("S"));
        
        System.out.println("----------------");
        
        System.out.printf("A soma dos números pares é %d\n", soma);
        System.out.printf("O produto dos números ímpares é %d\n", prod);
        
    }
    
}
