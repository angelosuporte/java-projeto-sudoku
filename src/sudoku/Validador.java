package sudoku;

public class Validador {
	
	public boolean validarLinha(Celula[][] tabuleiro, int linha) {
		boolean[] visto = new boolean[9];
		for(int coluna = 0; coluna < 9; coluna++ ) {
			int valor = tabuleiro[linha][coluna].getValor();
            if (valor != 0) { 
                if (visto[valor - 1]) {
                    return false;  // Se o número já foi visto, é inválido
                }
                return visto[valor -1] = true;
		}
	}
		return true;
	}
	  // Valida a coluna no tabuleiro
    public boolean validarColuna(Celula[][] tabuleiro, int coluna) {
        boolean[] visto = new boolean[9];
        for (int linha = 0; linha < 9; linha++) {
            int valor = tabuleiro[linha][coluna].getValor();
            if (valor != 0) {
                if (visto[valor - 1]) {
                    return false;
                }
                visto[valor - 1] = true;
            }
        }
        return true;
    }
    
    // Valida o bloco 3x3 no tabuleiro
    public boolean validarBloco(Celula[][] tabuleiro, int bloco) {
        boolean[] visto = new boolean[9];
        int linhaStart = (bloco / 3) * 3;
        int colunaStart = (bloco % 3) * 3;

        for (int i = linhaStart; i < linhaStart + 3; i++) {
            for (int j = colunaStart; j < colunaStart + 3; j++) {
                int valor = tabuleiro[i][j].getValor();
                if (valor != 0) {
                    if (visto[valor - 1]) {
                        return false;
                    }
                    visto[valor - 1] = true;
                }
            }
        }
        return true;
    }

    // Valida o tabuleiro inteiro
    public boolean validarTabuleiro(Celula[][] tabuleiro) {
        for (int i = 0; i < 9; i++) {
            if (!validarLinha(tabuleiro, i) || !validarColuna(tabuleiro, i)) {
                return false;
            }
        }

        // Valida os blocos 3x3
        for (int i = 0; i < 9; i++) {
            if (!validarBloco(tabuleiro, i)) {
                return false;
            }
        }
        return true;
    }
}
