package sudoku;

public class Validador {
	
	// Valida se o valor pode ser colocado na célula sem violar as regras
    public boolean validarJogada(Celula[][] tabuleiro, int linha, int coluna, int valor) {
        // Verifica se o valor já existe na linha, coluna ou bloco
        return validarLinha(tabuleiro, linha, valor) &&
               validarColuna(tabuleiro, coluna, valor) &&
               validarBloco(tabuleiro, linha, coluna, valor);
    }

    // Valida a linha
    private boolean validarLinha(Celula[][] tabuleiro, int linha, int valor) {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[linha][i].getValor() == valor) {
                return false;
            }
        }
        return true;
    }

    // Valida a coluna
    private boolean validarColuna(Celula[][] tabuleiro, int coluna, int valor) {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i][coluna].getValor() == valor) {
                return false;
            }
        }
        return true;
    }

    // Valida o bloco 3x3
    private boolean validarBloco(Celula[][] tabuleiro, int linha, int coluna, int valor) {
        int linhaStart = (linha / 3) * 3;
        int colunaStart = (coluna / 3) * 3;
        
        for (int i = linhaStart; i < linhaStart + 3; i++) {
            for (int j = colunaStart; j < colunaStart + 3; j++) {
                if (tabuleiro[i][j].getValor() == valor) {
                    return false;
                }
            }
        }
        return true;
    }

    // Valida o tabuleiro inteiro
    public boolean validarTabuleiro(Celula[][] tabuleiro) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tabuleiro[i][j].getValor() == 0) {
                    return false; // Se houver algum valor 0 (não preenchido), o tabuleiro não é válido
                }
            }
        }
        return true;
    }
}
