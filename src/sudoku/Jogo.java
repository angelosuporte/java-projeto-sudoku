package sudoku;

public class Jogo {
	
    private Tabuleiro tabuleiro;
    private Jogador jogador;
    private Validador validador;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        jogador = new Jogador();
        validador = new Validador();
    }

    // Iniciar o jogo, configurando o tabuleiro e o jogador
    public void iniciarJogo() {
        tabuleiro = new Tabuleiro(); // Preenche o tabuleiro com os valores iniciais
        jogador.getNome();
    }

    // Mostrar o tabuleiro
    public void mostrarTabuleiro() {
        tabuleiro.mostrarTabuleiro(); // Método que exibe o tabuleiro
    }

    // Verificar se o jogador venceu
    public boolean verificarVitoria() {
        return validador.validarTabuleiro(tabuleiro.getTabuleiro()); // Valida o tabuleiro completo
    }

    // Realizar uma jogada
    public boolean fazerJogada(int linha, int coluna, int valor) {
        if (validador.validarJogada(tabuleiro.getTabuleiro(), linha, coluna, valor)) {
            tabuleiro.preencherCelula(linha, coluna, valor);
            return true;
        }
        return false;
    }


}
