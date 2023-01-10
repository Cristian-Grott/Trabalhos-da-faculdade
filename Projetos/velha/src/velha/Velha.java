package velha;
//--
import java.util.Scanner;

public class Velha {
//=================IMPRIMINDO O TABULEIRO=======================================
static void tabuleiro(String local[][]){
    System.out.println("####JOGO DA VELHA####");

    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            System.out.print(" " +local[i][j]);
            
            if(j!=2){
                System.out.print(" |");
            }
        }

        System.out.println();

        if(i!=2){
            System.out.println("---+---+---");
        }
    }
}
//=================TROCANDO JOGADORES===========================================    
    static String trocajogador(String jog){
        
        if("O".equals(jog)){
            jog = "X";
        }else{
            jog = "O";
        }
        
        return jog;
        
    }
//====================VALIDANDO JOGADA==========================================
    static boolean jogadavalida(int jogar, boolean valida, String local[][]){
    
        boolean aux;
        boolean aux2 = false;
//Verificando se o número digitado está entre 1 e 9
        aux = !((jogar<1) || (jogar>9));
//Verificando se já não foi digitado esse número        
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                
                if(local[i][j].equals(Integer.toString(jogar))){
                    aux2 = true;
                }
                
            }
        }
        
        valida = ((aux==true) && (aux2==true));
        
        return valida;
        
    }
//=====================VERIFICANDO SE O JOGO ACABOU=============================    
    static boolean fimdojogo(String local[][], boolean jogar, String jog){
        
        jogar = false;
        
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                
                if((!"X".equals(local[i][j])) && (!"O".equals(local[i][j]))){
                    jogar = true;
                }
                
            }
        }
//ganhador, se tiver..
//linha
        for(int i=0; i<3; i++){
            
            if(((local[i][0].equals(local[i][1])) && (local[i][1].equals(local[i][2]))) ||
                ((local[0][i].equals(local[1][i])) && (local[1][i].equals(local[2][i])))){
                
                jogar = false;
                System.out.println("JOGADOR "+jog+" GANHOU!!!");
                
            }
            
        }
//diagonal            
        if(((local[0][0].equals(local[1][1])) && (local[1][1].equals(local[2][2]))) ||
            ((local[0][2].equals(local[1][1])) && (local[1][1].equals(local[2][0])))){
            
            jogar = false;
            System.out.println("JOGADOR "+jog+" GANHOU!!!");
            
        }
        
        if(jogar==false){
            System.out.println("FIM DO JOGO!!!");
        }

        return jogar;
        
    }

public static void main(String[] args) {
//=========================================================================================================================================================    
    Scanner input = new Scanner(System.in);
//================================VARIÁVEIS=====================================    
        int cont=1;
        int jogada;
        boolean jogar = true;
        boolean valida = true;
        String jogador = "X";
        String local[][] = new String[3][3];
//========================INSERINDO VALORES NO VETOR============================    
    for(int i=0;i<3; i++){
        for(int j=0; j<3; j++){
            local[i][j] = Integer.toString(cont);
            cont+=1;
        }
    }
//========================IMPRIMINDO O TABULEIRO================================
    tabuleiro(local);
//======================COMEÇANDO O JOGO========================================
    do{
//=======================FAZENDO A JOGADA=======================================        
        do{
        
            if(valida==false){
                System.out.println("ERRO!! SELECIONE UMA ALTERNATIVA VÁLIDA!");
            }
            
            System.out.println("Jogador " +jogador+": ");
            System.out.print("Digite o local da jogada: ");
                jogada = input.nextInt();
        
            valida = jogadavalida(jogada, valida, local);
            
        }while(valida==false);
//==============ATRIBUINDO A JOGADA AO LOCAL ESCOLHIDO==========================
            for(int i=0;i<3; i++){
                for(int j=0; j<3; j++){
                
                    if(local[i][j].equals(Integer.toString(jogada))){
                        local[i][j] = jogador;
                    }
                
                }
            }
        
        tabuleiro(local);
        
        jogar = fimdojogo(local, jogar, jogador);
        
        jogador = trocajogador(jogador);
        
    }while(jogar==true);
//=========================================================================================================================================================    
}
    
}