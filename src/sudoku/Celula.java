package sudoku;

public class Celula {

	private int valor;
	private Boolean fixada;

	public Celula(int valor, Boolean fixada) {
		this.valor = valor;
		this.fixada = fixada;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		if (!fixada) {
			this.valor = valor;
		}
	}
	
	public boolean isFixada() {
		return fixada;
	}
	
	public void setFixada(boolean fixada) {
		this.fixada = fixada;
	}

}
