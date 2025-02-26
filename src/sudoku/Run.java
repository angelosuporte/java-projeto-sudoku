package sudoku;

import java.util.Scanner;

public class Run {

	 private Jogo jogo;
	    private Scanner scanner;

	    public Run() {
	        jogo = new Jogo();
	        scanner = new Scanner(System.in);
	    }

	    // Método para iniciar o jogo
	    public void iniciarJogo() {
	        jogo.iniciarJogo(); // Chama o método para iniciar o jogo
	        while (!jogo.verificarVitoria()) {
	            mostrarTabuleiro();
	            fazerJogada();
	        }
	        mostrarTabuleiro();
	        System.out.println("Parabéns, você venceu!");
	    }

	    // Exibe o tabuleiro
	    private void mostrarTabuleiro() {
	        jogo.mostrarTabuleiro();  // Método para exibir o tabuleiro no console
	    }

	    // Método para o jogador fazer uma jogada
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
	            System.out.println("Jogada inválida! Tente novamente.");
	        }
	    }
	    
	    public static void main(String[] args) {
	        Run run = new Run();
	        run.iniciarJogo();  // Inicia o jogo
	    }
}
