package livraria;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.Normalizer;

public class Livro {
    
    private int codigo;
    private String titulo;
    private String editora;
    private String categoria;
    private int ano;
    private float valor;
    private int estoque;

    public Livro(int codigo, String titulo, String editora, String categoria, int ano, float valor, int estoque) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.categoria = categoria;
        this.ano = ano;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void info(){
        System.out.println(">>>>> Cod#" +getCodigo());
        System.out.println("Titulo/Editora: " +getTitulo()+ "/" +getEditora());
        System.out.println("Categoria: " +getCategoria());
        System.out.println("Ano: " +getAno());
        System.out.printf("Valor: R$%.2f\n", getValor());
        System.out.println("Estoque: " +getEstoque());
        System.out.printf("Valor total em estoque: R$%.2f\n", getValor()*getEstoque());
    }
    
    public static void cadastrarLivro(ArrayList<Livro> livros, Livro livro){
        livros.add(livro);
    }
    
    public static void listarLivros(ArrayList<Livro> livros){ // Método, o qual imprime as informações dos livros cadastrados
        boolean temLivros = false;
        
        System.out.println("             LIVROS CADASTRADOS"); // Cabeçalho
        for (Livro livro : livros) {
            if(!livros.isEmpty()){
                temLivros = true;
                System.out.println("------------------------------------------------");
                livro.info();// Impressão das informações dos livros
            }
            
        }
        if(!temLivros){
            System.out.println("NENHUM LIVRO ENCONTRADO NA BUSCA");
        }

    }
    
    public static void buscarLivroPorNome(ArrayList<Livro> livros, String titulo){ //Método, o qual busca as informações de um livro através de seu nome ou parte do seu nome
        boolean temLivros = false;
        String tituloSemAcentos = Normalizer.normalize(titulo, Normalizer.Form.NFD);
        
        for (Livro livro : livros) { // Laço que percorre todo o ArrayList Livros
        	
        	String tituloVerificadoSemAcento = Normalizer.normalize(livro.getTitulo(), Normalizer.Form.NFD);
            // Condição que verifica se a informação buscada está no titulo livro
            if(tituloVerificadoSemAcento.toLowerCase().contains(tituloSemAcentos.toLowerCase())){
                temLivros = true;
                livro.info(); // Impressão das informações dos livros que condizem à busca
                System.out.println("------------------------------------------------");
            }
        }
        
        if(!temLivros){
            System.out.println("NENHUM LIVRO ENCONTRADO NA BUSCA");
        }
    }
    
    public static void buscarLivroPorCategoria(ArrayList<Livro> livros, String categoria) {
        boolean temLivros = false;
        
        for (Livro livro : livros) { // Laço que percorre todo o ArrayList Livros
            
            // Condição que verifica se a informação buscada está na categoria do livro
            if(livro.getCategoria().toLowerCase().contains(categoria.toLowerCase())){
                temLivros = true;
                livro.info(); // Impressão das informações dos livros que condizem à busca
                System.out.println("------------------------------------------------");
            }
        }
        
        if(!temLivros){
            System.out.println("NENHUM LIVRO ENCONTRADO NA BUSCA");
        }
    }
    
    public static void buscarLivroPorPreco(ArrayList<Livro> livros, float valor) {
        boolean temLivros = false;
        
        for (Livro livro : livros) { // Laço que percorre todo o ArrayList Livros
            
            // Condição que verifica se a informação buscada possui o valor menor ou igual ao do livro
            if(livro.getValor()<=valor){
                temLivros = true;
                livro.info(); // Impressão das informações dos livros que condizem à busca
                System.out.println("------------------------------------------------");
            }
        }
        
        if(!temLivros){
            System.out.println("NENHUM LIVRO ENCONTRADO NA BUSCA");
        }
        
    }
    
    public static void buscarPorQuantidadeEmEstoque(ArrayList<Livro> livros, int estoque) {
        boolean temLivros = false;
        
        for (Livro livro : livros) { // Laço que percorre todo o ArrayList Livros
            
            // Condição que verifica se a informação buscada possui o estoque menor ou igual ao do livro
            if(livro.getEstoque()>=estoque){
                temLivros = true;
                livro.info(); // Impressão das informações dos livros que condizem à busca
                System.out.println("------------------------------------------------");
            }
        }
        
        if(!temLivros){
            System.out.println("NENHUM LIVRO ENCONTRADO NA BUSCA");
        }
        
    }
    
    public static void valorTotalEmEstoque(ArrayList<Livro> livros) {
        float valorTotal=0;
        
        for (Livro livro : livros) {
            valorTotal += (livro.getValor()*livro.getEstoque());
        }
        
        System.out.printf("Valor total em estoque: R$%.2f\n", valorTotal);
    }
    
    public static float corrigirValor(String valor){
        if(valor.contains(",")){
            valor = valor.replace(",", ".");
        }
        
        return Float.parseFloat(valor);
    }
    
    public static void carregarEstoque(ArrayList <Livro> livros) throws FileNotFoundException {
    	Livro L1;
    	FileInputStream arquivoLeitura = new FileInputStream("src\\livraria\\Livros.txt"); //Intanciamento do objeto arquivoLeitura trazendo o TXT Livros
        Scanner inputArquivo = new Scanner(arquivoLeitura); // Scanner para a entrada de dados pelo objeto arquivo
    	
    	String linha; //String que recebe a linha do arquivo importado
        String SL[]; // Vetor que recebe as informações de uma linha do arquivo
    	
    	while(inputArquivo.hasNextLine()){
            linha = inputArquivo.nextLine(); // Recebe uma String com o valor de uma linha do arquivo
            SL = linha.split(", "); // Retira as virgulas da linha e separa como dados diferentes em um vetor
            L1 = new Livro(Integer.parseInt(SL[0]), SL[1], SL[2], SL[3], Integer.parseInt(SL[4]),
                            Float.parseFloat(SL[5]), Integer.parseInt(SL[6]));
            Livro.cadastrarLivro(livros, L1);
        }
        
        // Uma entrada de dados para não voltar automaticamente ao menú principal
        System.out.println("LIVROS IMPORTADOS COM SUCESSO");
    }
    
    public static void gravarLivros(ArrayList<Livro> livros) throws IOException{ // Método, o qual imprime as informações dos livros cadastrados no TXT
        boolean temLivros = false;
    		
        if(!livros.isEmpty()){
        	FileWriter arquivoEscrita = new FileWriter("src\\livraria\\Livros.txt"); //Instanciamento do objeto arquivoEscrito trazendo o TXT Livros
        	PrintWriter outputArquivo = new PrintWriter(arquivoEscrita); // Objeto que imprime no TXT as informações do programa
        	
        	temLivros = true;
        	for (Livro livro : livros) {
        		outputArquivo.println(livro.getCodigo() + ", " + livro.getTitulo() + ", " + livro.getEditora() + ", "
        				+ livro.getCategoria() + ", " + livro.getAno() + ", " + livro.getValor() + ", " + livro.getEstoque());
        	}
            
        	outputArquivo.close();
        }
        
        
        if(!temLivros){
            System.out.println("NENHUM LIVRO ENCONTRADO NA BUSCA");
        }

    }
    
}
