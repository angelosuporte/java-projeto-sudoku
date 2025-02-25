package sudoku;

public class Jogador {

	private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    // M�todo para fazer uma jogada (exemplo simplificado)
    public void fazerJogada(int linha, int coluna, int valor) {
        System.out.println(nome + " fez uma jogada na linha " + linha + ", coluna " + coluna + " com o valor " + valor);
    }

}
