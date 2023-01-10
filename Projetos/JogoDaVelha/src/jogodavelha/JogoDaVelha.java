package jogodavelha;

import java.util.Scanner;
import java.util.Random;

public class JogoDaVelha {
//========================IMPRIMINDO O TABULEIRO================================
static void tabuleiro(String posicaovisu[][]){
    System.out.println("####JOGO DA VELHA####");

    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            System.out.print(" " +posicaovisu[i][j]);
            
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
//======================VERIFICANDO SE A JOGADA É VÁLIDA========================
static boolean jogada_valida(int jogada, String localvisu[][]){
    boolean valida, aux1, aux2 = false;
    
    aux1 = (jogada>0) && (jogada<10); //--verificando se a posição existe--
    
    for(int i=0; i<3; i++){ //--verificando se a posição está ocupada
        for(int j=0; j<3; j++){
            if(localvisu[i][j].equals(Integer.toString(jogada))){
                aux2 = true;
            }
        }
    }
    
    valida = (aux1) && (aux2);
    
    return valida;
}
//========================TROCANDO OS JOGADORES=================================
static String trocajogador(String jogador){
    if("X".equals(jogador)){
        jogador = "O";
    }else{
        jogador = "X";
    }
    return jogador;
}
//==================VERIFICANDO SE O JOGO ACABOU================================
static boolean fim_do_jogo(int jogadas, int local[][], boolean fimdojogo, String jogador){
    if(jogadas==9){
        fimdojogo = true;
    }
    
    for(int i=0; i<3; i++){ //--verificando se houve um vencedor nas linhas e colunas--
        if((local[i][0]+local[i][1]+local[i][2]==3) || (local[0][i]+local[1][i]+local[2][i]==3) ||
            (local[i][0]+local[i][1]+local[i][2]==-3) || (local[0][i]+local[1][i]+local[2][i]==-3)){
            
            System.out.println("jogador \"" +jogador+ "\" VENCEU");
            fimdojogo = true;
        }
    }
//--verificando se houve um vencedor nas diagonais--
    if((local[0][0]+local[1][1]+local[2][2]==3) || (local[0][2]+local[1][1]+local[2][0]==3) ||
        (local[0][0]+local[1][1]+local[2][2]==-3) || (local[0][2]+local[1][1]+local[2][0]==-3)){
        
        System.out.println("jogador \"" +jogador+ "\" VENCEU");
        fimdojogo = true;
    }
    
    if(fimdojogo==true){
        System.out.println("FIM DO JOGO!");
    }
    
    return fimdojogo;
}
//===========================METODO MAIN========================================
public static void main(String[] args) {

    Random maquina = new Random();
    Scanner input = new Scanner(System.in); //--variáveis--
        String posicao[][] = new String[3][3];
        int local[][] = new int[3][3];
        int cont = 1;
        int jogada = 0;
        String simbolo;
        boolean fimdojogo = false;
        boolean jogadavalida = false;
        boolean computadorjajogou;
        boolean quemcomeca;

    for(int i=0;i<3; i++){ //--zerando as posições--
        for(int j=0; j<3; j++){
            local[i][j] = 0;
        }
    }

    for(int i=0;i<3; i++){ //--preenchendo o vetor visual--
        for(int j=0; j<3; j++){
            posicao[i][j] = Integer.toString(cont);
            cont+=1;
        }
    }

    quemcomeca = maquina.nextBoolean(); //--sorteando quem começa--
    
    if(quemcomeca){
        simbolo = "X";
         tabuleiro(posicao); //--imprimindo o tabuleiro--
    }else{
        simbolo = "O";
        System.out.println("\"" +simbolo+ "\" COMEÇOU");
    }

    cont = 0;
    
    do{
        do{
            if("X".equals(simbolo)){
                System.out.println("Jogador "+simbolo);
                do{
                    System.out.print("Digite uma posição para jogar: "); //--minha vez de jogar--
                        jogada = input.nextInt();

                    jogadavalida = jogada_valida(jogada, posicao);

                    if(jogadavalida==false){
                        System.out.println("SELECIONE UMA POSIÇÃO VÁLIDA");
                    }
                }while(jogadavalida==false);
            }else{ //--vez do computador de jogar--
                do{
                    
                    computadorjajogou = false;

                    if(computadorjajogou==false){
                        if(local[0][0]+local[1][1]+local[2][2]==-2){ //--computador verificando se pode jogar na diagonal 1 para vencer--
                            for(int i=0; i<3; i++){
                                if(local[i][i]==0){
                                    local[i][i] = -1;
                                    posicao [i][i] = simbolo;
                                    computadorjajogou = true;
                                    break;
                                }
                            }
                        }
                    }

                    if(computadorjajogou==false){
                        if(local[0][2]+local[1][1]+local[2][0]==-2){ //--computador verificando se pode jogar na diagonal 2 para ganhar--
                            if(local[0][2]==0){
                                local[0][2] = -1;
                                posicao [0][2] = simbolo;
                                computadorjajogou = true;
                                break;
                            }else if(local[1][1]==0){
                                local[1][1] = -1;
                                posicao [1][1] = simbolo;
                                computadorjajogou = true;
                                break;
                            }else if(local[2][0]==0){
                                local[2][0] = -1;
                                posicao [2][0] = simbolo;
                                computadorjajogou = true;
                                break;
                            }
                        }
                    }

                    if(computadorjajogou==false){
                        for(int j=0; j<3; j++){ //--computador verificando se pode jogar na vertical para vencer--
                            if(local[0][j]+local[1][j]+local[2][j]==-2){
                                for(int i=0; i<3; i++){
                                    if(local[i][j]==0){
                                        local[i][j] = -1;
                                        posicao[i][j] = simbolo;
                                        computadorjajogou = true;
                                        break;
                                    }
                                }

                                break;
                            }
                        }
                    }

                    for(int i=0; i<3; i++){ //--computador verificando se pode jogar na horizontal para vencer--
                        if(local[i][0]+local[i][1]+local[i][2]==-2){
                            for(int j=0; j<3; j++){
                                if(local[i][j]==0){
                                    local[i][j] = -1;
                                    posicao[i][j] = simbolo;
                                    computadorjajogou = true;
                                    break;
                                }
                            }

                            break;
                        }
                    }

                    if(computadorjajogou==false){
                        if(local[0][0]+local[1][1]+local[2][2]==2){ //--computador verificando se pode jogar na diagonal 1 para me cortar--
                            for(int i=0; i<3; i++){
                                if(local[i][i]==0){
                                    local[i][i] = -1;
                                    posicao [i][i] = simbolo;
                                    computadorjajogou = true;
                                    break;
                                }
                            }
                        }
                    }

                    if(computadorjajogou==false){
                        if(local[0][2]+local[1][1]+local[2][0]==2){ //--computador verificando se pode jogar na diagonal 2 para me cortar--
                            if(local[0][2]==0){
                                local[0][2] = -1;
                                posicao [0][2] = simbolo;
                                computadorjajogou = true;
                                break;
                            }else if(local[1][1]==0){
                                local[1][1] = -1;
                                posicao [1][1] = simbolo;
                                computadorjajogou = true;
                                break;
                            }else if(local[2][0]==0){
                                local[2][0] = -1;
                                posicao [2][0] = simbolo;
                                computadorjajogou = true;
                                break;
                            }
                        }
                    }

                    if(computadorjajogou==false){
                        for(int j=0; j<3; j++){ //--computador verificando se pode jogar na vertical para me cortar--
                            if(local[0][j]+local[1][j]+local[2][j]==2){
                                for(int i=0; i<3; i++){
                                    if(local[i][j]==0){
                                        local[i][j] = -1;
                                        posicao[i][j] = simbolo;
                                        computadorjajogou = true;
                                        break;
                                    }
                                }

                                break;
                            }
                        }
                    }

                    if(computadorjajogou==false){
                        for(int i=0; i<3; i++){ //--computador verificando se pode jogar na horizontal para me cortar--
                            if(local[i][0]+local[i][1]+local[i][2]==2){
                                for(int j=0; j<3; j++){
                                    if(local[i][j]==0){
                                        local[i][j] = -1;
                                        posicao[i][j] = simbolo;
                                        computadorjajogou = true;
                                        break;
                                    }
                                }

                                break;
                            }
                        }
                    }

                    if(computadorjajogou==false){
                        jogada = maquina.nextInt(9)+1;
                        jogadavalida = jogada_valida(jogada, posicao);
                    }

                }while(jogadavalida==false);
            } 
        }while(jogadavalida==false);

        for(int i=0;i<3; i++){ //--inserindo o a jogada na posição--
            for(int j=0; j<3; j++){
                if(posicao[i][j].equals(Integer.toString(jogada))){
                    posicao[i][j] = simbolo;

                    if("X".equals(simbolo)){
                        local[i][j] = 1;
                    }else{
                        local[i][j] = -1;
                    }
                }
            }
        }

        if("O".equals(simbolo)){
            tabuleiro(posicao);
        }

        cont+=1;
        fimdojogo = fim_do_jogo(cont, local, fimdojogo, simbolo);
        simbolo = trocajogador(simbolo);

    }while(fimdojogo==false);
}
//=========================FIM DO METODO MAIN===================================
}