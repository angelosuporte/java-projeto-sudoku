package sudoku;

public class Jogo {
	
    private Tabuleiro tabuleiro;
    private Jogador jogador;

    public Jogo() {
        this.tabuleiro = new Tabuleiro();
        this.jogador = new Jogador("Jogador 1");
    }

    // Método para iniciar o jogo
    public void iniciarJogo() {
        System.out.println("Iniciando o jogo...");
        tabuleiro.resetarTabuleiro();  // Reseta o tabuleiro antes de iniciar
        jogador = new Jogador("Jogador 1");  // Atribui o jogador
        System.out.println("Jogo iniciado!");
    }

    // Método para resolver o tabuleiro 
    public void resolverTabuleiro() {
        System.out.println("Resolvendo o tabuleiro...");
        // Aqui poderia ter uma lógica para resolver o tabuleiro (algoritmo de resolução)
        System.out.println("Tabuleiro resolvido!");
    }

    // Método para verificar se o jogo foi vencido
    public boolean verificarVitoria() {
        // Verifica se o tabuleiro está completo e se todas as regras são seguidas
        return tabuleiro.validarTabuleiro();
    }


}
