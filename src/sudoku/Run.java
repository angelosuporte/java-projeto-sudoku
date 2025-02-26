package sudoku;

import java.util.Scanner;

public class Run {

	 private Jogo jogo;
	    private Scanner scanner;

	    public Run() {
	        jogo = new Jogo();
	        scanner = new Scanner(System.in);
	    }

	    // M�todo para iniciar o jogo
	    public void iniciarJogo() {
	        jogo.iniciarJogo(); // Chama o m�todo para iniciar o jogo
	        while (!jogo.verificarVitoria()) {
	            mostrarTabuleiro();
	            fazerJogada();
	        }
	        mostrarTabuleiro();
	        System.out.println("Parab�ns, voc� venceu!");
	    }

	    // Exibe o tabuleiro
	    private void mostrarTabuleiro() {
	        jogo.mostrarTabuleiro();  // M�todo para exibir o tabuleiro no console
	    }

	    // M�todo para o jogador fazer uma jogada
	    private void fazerJogada() {
	        System.out.print("Informe a linha (0-8): ");
	        int linha = scanner.nextInt();
	        System.out.print("Informe a coluna (0-8): ");
	        int coluna = scanner.nextInt();
	        System.out.print("Informe o valor (1-9): ");
	        int valor = scanner.nextInt();

	        if (jogo.fazerJogada(linha, coluna, valor)) {
	            System.out.println("Jogada feita com sucesso!");
	        } else {
	            System.out.println("Jogada inv�lida! Tente novamente.");
	        }
	    }
	    
	    public static void main(String[] args) {
	        Run run = new Run();
	        run.iniciarJogo();  // Inicia o jogo
	    }
}
