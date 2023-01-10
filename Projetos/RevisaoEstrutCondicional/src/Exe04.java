/*
 * 4) Aplica uma multa de 10% nas contas de energia elétrica com gasto maior que 100
 * kWh, sendo o valor do kWh 1,50$. Ex: consumo 120 retorna R$ 198,00
 */

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int kWh;
        
        System.out.print("Informe quantos kWh foram gastos: ");
            kWh = input.nextInt();
        
        System.out.println("----------------");
        
        if(kWh<=100){
            System.out.printf("Valor total: R$%.2f\n", (kWh*1.5));
        }else{
            System.out.printf("Valor total: R$%.2f\n", ((kWh*1.5)*1.1));
        }
        
    }
    
}
