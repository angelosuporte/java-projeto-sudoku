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
	
}
