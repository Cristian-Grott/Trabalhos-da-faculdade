package alunos;

import java.util.Scanner;

public class Alunos {

    public static void main (String[]args){

        Scanner input = new Scanner (System.in);

        String nome[] = new String[10];
        String sobrenome[] = new String[10];
        int nota[] = new int[10];
        int op = 0;
        int cadastrar;
        int matricula;
        float media=0;
        int cont=0;

        do{ //Laço para sair ou continuar no menu
            // MENU
    	    System.out.println ("[1] Cadastrar aluno");
	    System.out.println ("[2] Informações dos alunos");
	    System.out.println ("[3] Modificar nota");
            System.out.println ("[4] Média das notas");
            System.out.println ("[0] SAIR");

	    System.out.print("Selecione uma das opções acima: ");
            
            do{ //Laço que controla se a opção será digitada corretamente
	            op = input.nextInt ();
                
                System.out.println("===============================");

	        switch (op){
	            case 1: // Cadastrar alunos
                        input.nextLine();
                        
                        for (int i = 0; i < nome.length; i++) {
                            if (nome[i]==null) { // Só preencherá as posições que estão vazias
                                System.out.println("MATRÍCULA 000"+(i+1));
                                System.out.println("-------------------------------");
                                // Cadastramento do aluno
                                System.out.print("Digite o nome do aluno: ");
                                    nome[i] = input.nextLine();
                                System.out.print("Digite o sobrenome do aluno: ");
                                    sobrenome[i] = input.nextLine();
                                System.out.print("Digite a nota do aluno: ");
                                
                                do{ // Só permitirá notas acima de zero e abaixo de 10
                                    nota[i] = input.nextInt();
                                    
                                    if (nota[i]<0 || nota[i]>10) { // Caso seja uma nota inválida
                                        System.out.println("Nota inválida");
                                        System.out.print("Digite uma nota válida: ");
                                    }
                                }while(nota[i]<0 || nota[i]>10);
                                
                                System.out.println("Cadastrar mais um aluno? [1] SIM    [2] NÃO");
                                    
                                do{ // Só permitirá ao usuário digitar as opções 1 ou 2
                                        cadastrar = input.nextInt();
                                            
                                    if (cadastrar>2 || cadastrar<1) { // Caso digite uma opção inválida
                                        System.err.println("Opção inválida");
                                        System.err.print("Digite uma opção válida: ");
                                    }
                                }while(cadastrar>2 || cadastrar<1);
                                    
                                if (cadastrar==2) { //Caso o usuário não queira cadastrar mais
                                    i=nome.length;
                                }else{ // Caso queira
                                    input.nextLine();
                                    System.out.println("-------------------------------");
                                }
                            }
                        }
                        
                        if (nome[nome.length-1]!=null) { //Caso não tenha mais espaços para armazenar alunos
                            System.err.println("Não há mais espaço para cadastrar alunos");
                        }
                        System.out.println("===============================");
                        break;
                        
                    case 2: // Mostrar informações dos alunos
                        input.nextLine();
                        
                        if(nome[0]==null){ //Caso não haja alunos cadastrados
                            System.err.printf("Não há nenhum aluno cadastrado\n");
                            System.err.println("Para cadastrar um aluno, digite [1] no menú");
                        }else{ // Caso haja
                            for (int i = 0; i < nome.length; i++) {
                                if (nome[i]!=null) {
                                    System.out.println("Matricula: 000" +(i+1));
                                    System.out.println("-------------------------------");
                                    System.out.println("Nome do aluno: " +nome[i]+ " " +sobrenome[i]);
                                    System.out.println("Nota: " +nota[i]);
                                    System.out.println("===============================");
                                }
                            }
                        }
                        break;
                        
		    case 3: // Mudar a nota do aluno
                        
                        if(nome[0]!=null){ // Caso haja alunos cadastrados
                            System.out.print("Digite a matrícula do aluno, o qual a nota será alterada: ");
                                matricula = input.nextInt();
                                
                                if(nome[matricula-1]==null){
                                    System.out.println("Matrícula inválida");
                                    break;
                                }
                        
                            System.out.println("===============================");
                            System.out.println("Aluno: " +nome[matricula-1]+ " " +sobrenome[matricula-1]);
                            System.out.println("===============================");
                        
                            System.out.print("Digite a nova nota: ");
                                
                                do{ // Só permitirá digitar notas válidas
                                        nota[matricula-1] = input.nextInt();
                                
                                    if (nota[matricula-1]<0 || nota[matricula-1]>10) {
                                        System.out.println("Nota inválida");
                                        System.out.print("Digite uma nota válida: ");
                                    }
                                }while(nota[matricula-1]<0 || nota[matricula-1]>10);
                            
                            System.out.println("NOTA ALTERADA");
                        }else{ //Caso não haja alunos cadastrados
                            System.out.println("Não há nenhum aluno cadastrado");
                        }
                        
                        System.out.println("===============================");
                        break;
                        
                    case 4:
                        if(nome[0]!=null){ // Caso haja alunos cadastrados
                            for (int i = 0; i < nome.length; i++) {
                                if (nome[i]!=null) {
                                    cont++;
                                    media+=nota[i];
                                }
                            }
                        
                            media/=cont;
                        
                            System.out.println("Média dos alunos: " +media);
                        }else{ //Caso não haja
                            System.out.println("Não há nenhum aluno cadastrado");
                        }
                        
                        cont=0;
                        media=0;
                        System.out.println("===============================");
                        break;
                        
		    case 0: // Sair do sistema
                        System.out.println("Você saiu do sistema");
                        System.out.println("===============================");
                        break;
                        
                    default: // Caso digite uma opção inválida
		        System.err.println ("Opção inválida");
		        System.err.print ("Digite uma opção válida: ");
                }
	    }while (op > 4 || op < 0);

        }while (op != 0);

    }
    
}
