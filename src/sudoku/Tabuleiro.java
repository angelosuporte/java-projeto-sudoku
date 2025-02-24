package sudoku;

public class Tabuleiro {

	private Celula[][] tabuleiro;

	public Tabuleiro() {
		this.tabuleiro = new Celula[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				tabuleiro[i][j] = new Celula(0, false);
			}
		}
	}
	
	public void resetarTabuleiro() {
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				tabuleiro[i][j] = new Celula(0, false);
			}
		}
	}
	
	public void preencherCelula(int linha, int coluna, int valor) {
		if(tabuleiro[linha][coluna].isFixada()) {
			System.out.println("Essa célula não pode ser alterada.");
		}else {
			tabuleiro[linha][coluna].setValor(valor);
		}
	}
	
	public void mostrarTabuleiro() {
		for(int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				System.out.println(tabuleiro[i][j].getValor() + " ");
			}
			System.out.println();
		}
	}
	
    // Método para validar o tabuleiro (usando a classe Validador)
    public boolean validarTabuleiro() {
        Validador validador = new Validador();
        return validador.validarTabuleiro(this.tabuleiro);
    }

	
}
