package Jogo;

import java.util.Scanner;

public class testejogotres {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int resposta1 = 0, resposta2 = 0, resposta3 = 0, resposta4 = 0, resposta5 = 0, resposta6 = 0;
		int pontuacao = 0;
		
		System.out.println("\n=== Saga Generator - Em busca do FullStack em Java ===");
	    System.out.println("--------------------------------------------------------");		
        System.out.println("1. Iniciar jogo");
        System.out.println("2. Sair");
        
        System.out.print("Escolha uma opção (1-2): ");
        int opcao = leia.nextInt();
        leia.nextLine();
        
        if (opcao == 1) {
	           
        	System.out.println("-----------------------------------------------------");	 	
            System.out.print("Digite o nome do seu personagem: ");
            String nome = leia.nextLine();
            System.out.println("Bem-vinde, " + nome+ "!");
            System.out.println();
        				}
        else {
        	System.out.println("Vejo você mais tarde !");
        }
        
        while(resposta1!=1) {
			System.out.println("----------------------FASE--1------------------------");
            System.out.println("\nQual dos comandos abaixo representa corretamente a"
            		+ " linha de código que faz a leitura dos dados digitados por um usuário?");
            System.out.println("																	");
            System.out.println("\t1) "+"Scanner leia = new Scanner(System.in);");
            System.out.println("\t2) "+"leia = scanner new scanner(system.in)");
            System.out.println("\t3) "+"scanner leia = new scanner(system.in):");
            
            System.out.println("\nDigite o número correspondente à reposta certa: ");
            resposta1 = leia.nextInt();
            
            
            if(resposta1 == 1) {
            	pontuacao+=10;
            	System.out.println("\nResposta certa! Sua pontuação é de "+pontuacao+"+ pontos. ");	
            	
            } else {
            	System.out.println("\nLamento, não era a resposta certa. ");
            }}
		
        while(resposta2!=2) {
			System.out.println("----------------------FASE--2------------------------");
            System.out.println("\nQuais são todas as variáveis primitivas do java?");
            System.out.println("\t1) int, float, double, boolean e char");
            System.out.println("\t2) byte, short, int, long, char, float, double e boolean");
            System.out.println("\t3) int, float, char, double, boolean e short");
            
            System.out.println("\nDigite o número correspondente à reposta certa: ");
            resposta2 = leia.nextInt();
            
            
            if(resposta2 == 2) {
            	pontuacao+=10;
            	System.out.println("\nResposta certa! Sua pontuação é de "+pontuacao+"+ pontos. ");	
            	
            } else {
            	System.out.println("\nLamento, não era a resposta certa. ");
            }}
		
	}

}
