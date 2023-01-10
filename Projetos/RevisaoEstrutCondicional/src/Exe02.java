/*
 * 2) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após,
 * calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar
 * se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão
 * escrever a mensagem 'Saldo Negativo'.
 */

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float saldo, debito, credito, saldoAtual;
        int conta;
        
        System.out.print("Digite o número da sua conta: ");
            conta = input.nextInt();
        
        System.out.print("Digite o saldo da sua conta: ");
            saldo = input.nextFloat();
        
        System.out.print("Digite o débito: ");
            debito = input.nextFloat();
            
        System.out.print("Digite o crédito: ");
            credito = input.nextFloat();
        
        System.out.println("================");
            
        saldoAtual = saldo-debito+credito;
        
        System.out.printf("Saldo atual: R$%.2f\n", saldoAtual);
        
        System.out.println("----------------");
        
        if(saldoAtual<0){
            System.out.println("Saldo negativo");
        }else{
            System.out.println("Saldo positivo");
        }
        
    }
    
}
