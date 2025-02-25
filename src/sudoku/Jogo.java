package sudoku;

public class Jogo {
	
    private Tabuleiro tabuleiro;
    private Jogador jogador;

    public Jogo() {
        this.tabuleiro = new Tabuleiro();
        this.jogador = new Jogador("Jogador 1");
    }

    // M�todo para iniciar o jogo
    public void iniciarJogo() {
        System.out.println("Iniciando o jogo...");
        tabuleiro.resetarTabuleiro();  // Reseta o tabuleiro antes de iniciar
        jogador = new Jogador("Jogador 1");  // Atribui o jogador
        System.out.println("Jogo iniciado!");
    }

    // M�todo para resolver o tabuleiro 
    public void resolverTabuleiro() {
        System.out.println("Resolvendo o tabuleiro...");
        // Aqui poderia ter uma l�gica para resolver o tabuleiro (algoritmo de resolu��o)
        System.out.println("Tabuleiro resolvido!");
    }

    // M�todo para verificar se o jogo foi vencido
    public boolean verificarVitoria() {
        // Verifica se o tabuleiro est� completo e se todas as regras s�o seguidas
        return tabuleiro.validarTabuleiro();
    }


}
