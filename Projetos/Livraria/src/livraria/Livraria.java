package livraria;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {

    public static void main (String[] args) throws Exception{
        
        FileInputStream arquivo = new FileInputStream("src\\livraria\\Livros.txt"); //Intanciamento do objeto arquivo trazendo o TXT Livros
        Scanner inputArquivo = new Scanner(arquivo); // Scanner para a entrada de dados pelo objeto arquivo
        Scanner input = new Scanner(System.in); // Scanner para entrada de dados manuais
        ArrayList <Livro> livros = new ArrayList(); // ArrayList de livros
        Livro L1;
        
        String linha; //String que recebe a linha do arquivo importado
        String SL[]; // Vetor que recebe as informações de uma linha do arquivo
        int codigo, ano, estoque; //Variáveis para armazenar informações dos livros
        String titulo, editora, categoria, valorNaoCorrigido;//Variáveis para armazenar informações dos livros
        float valor;
        int op, sair; // Variável de controle do menú principal

         // Cadastrando livros no ArrayList através do arquivo importado
        while(inputArquivo.hasNextLine()){
            linha = inputArquivo.nextLine(); // Recebe uma String com o valor de uma linha do arquivo
            SL = linha.split(", "); // Retira as virgulas da linha e separa como dados diferentes em um vetor
            L1 = new Livro(Integer.parseInt(SL[0]), SL[1], SL[2], SL[3], Integer.parseInt(SL[4]), Float.parseFloat(SL[5]), Integer.parseInt(SL[6]));
            Livro.cadastrarLivro(livros, L1);
        }
        
        do{ // Laço para repetir o menú enquanto o usuário não quiser sair do programa
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("[1] Cadastrar novo livro");
            System.out.println("[2] Listar livros");
            System.out.println("[3] Buscar livros por nome");
            System.out.println("[4] Buscar livros por categoria");
            System.out.println("[5] Buscar livros por preço");
            System.out.println("[6] Busca por quantidade em estoque");
            System.out.println("[7] Valor total em estoque");
            System.out.println("[0] Encerrar atividades");
            op = input.nextInt();
            
            System.out.println("================================================");
            
            // Switch case para controle do menú principal
            switch (op){
                case 1: // Cadastrar livro
                    System.out.println("             CADASTRO DE LIVROS"); // Cabeçalho
                    System.out.println("------------------------------------------------");
        
                    //Entrada de dados do livro
                    System.out.print("Digite um código para o livro: ");
                    codigo = input.nextInt();
                    System.out.print("Digite o título do livro: ");
                    input.nextLine();
                    titulo= input.nextLine();
                    System.out.print("Digite a editora do livro: ");
                    editora = input.nextLine();
                    System.out.print("Digite a categoria do livro: ");
                    categoria = input.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    ano = input.nextInt();
                    System.out.print("Digite o valor do livro: R$");
                    input.nextLine();
                    valorNaoCorrigido = input.nextLine();
                    valor = Livro.corrigirValor(valorNaoCorrigido); //Método que aceita vírgula e ponto como ponto flutuante
                    System.out.print("Digite a quantidade no estoque: ");
                    estoque = input.nextInt();
                    
                    L1 = new Livro(codigo, titulo, editora, categoria, ano, valor, estoque); // Atribuição das variáveis ao objeto l1
                    Livro.cadastrarLivro(livros, L1); // Adicionado o objeto ao ArrayList
        
                    System.out.println("************************************************");
                    System.out.println("LIVRO CADASTRADO COM SUCESSO!"); // Mensagem de livro cadastrado com sucesso
                    System.out.println("************************************************");
        
                    // Uma entrada de dados para não voltar automaticamente ao menú principal
                    System.out.print("Aperte ENTER para continuar.");
                    input.nextLine();
                    input.nextLine();
        
                    System.out.println("================================================");
                    break;
                    
                case 2: // Listar todos os livros cadastrados
                    Livro.listarLivros(livros);
                    
                    System.out.println("************************************************");
                    // Uma entrada de dados para não voltar automaticamente ao menú principal
                    System.out.print("Aperte ENTER para continuar.");
                    input.nextLine();
                    input.nextLine();
        
                    System.out.println("================================================");
                    break;
                    
                case 3: // Buscar livros pelo nome, ou parte dele
                    System.out.println("               BUSCA DE LIVRO"); // Cabeçalho
                    System.out.println("------------------------------------------------");
        
                    // Entrada do titulo do livro para buscá-lo
                    System.out.print("Digite o nome do livro: ");
                    input.nextLine();
                    titulo = input.nextLine();

                    System.out.println("------------------------------------------------");
                    
                    Livro.buscarLivroPorNome(livros, titulo); //Método que busca os livros pelo titulo ou parte dele
                    
                    // Uma entrada de dados para não voltar automaticamente ao menú principal
                    System.out.println("************************************************");
                    System.out.print("Aperte ENTER para continuar.");
                    input.nextLine();
        
                    System.out.println("================================================");
                    break;
                    
                case 4: // Buscar livro por categoria
                    System.out.println("               BUSCA DE LIVRO"); // Cabeçalho
                    System.out.println("------------------------------------------------");
        
                    // Entrada da categoria do livro para buscá-lo
                    System.out.print("Digite a categoria do livro: ");
                    input.nextLine();
                    categoria = input.nextLine();

                    System.out.println("------------------------------------------------");
                    
                    
                    Livro.buscarLivroPorCategoria(livros, categoria); //Método que busca os livros pela categoria
                    
                    // Uma entrada de dados para não voltar automaticamente ao menú principal
                    System.out.println("************************************************");
                    System.out.print("Aperte ENTER para continuar.");
                    input.nextLine();
        
                    System.out.println("================================================");
                    break;
                    
                case 5: // Buscar livro por preço
                    System.out.println("               BUSCA DE LIVRO"); // Cabeçalho
                    System.out.println("------------------------------------------------");
                
                    // Entrada de um valor para buscar livros com esse preço ou menos
                    System.out.print("Digite o valor do livro: R$");
                    input.nextLine();
                    valorNaoCorrigido = input.nextLine();
                    valor = Livro.corrigirValor(valorNaoCorrigido);
        
                    System.out.println("------------------------------------------------");
        
                    Livro.buscarLivroPorPreco(livros, valor); // Método que busca livro pelo preço
                    
                    // Uma entrada de dados para não voltar automaticamente ao menú principal
                    System.out.println("************************************************");
                    System.out.print("Aperte ENTER para continuar.");
                    input.nextLine();
        
                    System.out.println("================================================");
                    break;
                    
                case 6: // Buscar livro pela quantidade em estoque
                    System.out.println("               BUSCA DE LIVRO"); // Cabeçalho
                    System.out.println("------------------------------------------------");
                
                    // Entrada de um valor de estoque para buscar livros com esse estoque ou menos
                    System.out.print("Digite a quantidade em estoque: ");
                    estoque = input.nextInt();
        
                    System.out.println("------------------------------------------------");
                    
                    Livro.buscarPorQuantidadeEmEstoque(livros, estoque); // Método que busca os livros pela quantidade em estoque
                    
                    // Uma entrada de dados para não voltar automaticamente ao menú principal
                    System.out.println("************************************************");
                    System.out.print("Aperte ENTER para continuar.");
                    input.nextLine();
                    input.nextLine();
        
                    System.out.println("================================================");
                    break;
                    
                case 7: // Retornar o valor total em estoque
                    Livro.valorTotalEmEstoque(livros);
        
                    // Uma entrada de dados para não voltar automaticamente ao menú principal
                    System.out.println("************************************************");
                    System.out.print("Aperte ENTER para continuar.");
                    input.nextLine();
                    input.nextLine();
        
                    System.out.println("================================================");
                    break;
                    
                case 0:
                    
                    do{
                        System.out.println("Esse programa não tem um banco de dados.");
                        System.out.println("Caso você saia, todas as informações serão perdidas.");
                        System.out.println("Você tem certeza que quer sair?");
                        System.out.println("[1] SIM");
                        System.out.println("[2] NÃO");
                        sair = input.nextInt();
            
                        if(sair<1 || sair>2){
                            System.out.println("OPÇÃO INVÁLIDA!");
                        }
            
                        if(sair==2){
                            op=-1;
                        }else{
                            System.out.println("------------------------------------------------");
                            System.out.println("              PROGRAMA ENCERRADO");
                        }
                    }while(sair<1 || sair>2);
        
                    System.out.println("================================================");
                    break;
                    
                default:
                    System.out.println("OPÇÃO INVÁLIDA!!!");
            }
        }while(op!=0);

    }
    
}
