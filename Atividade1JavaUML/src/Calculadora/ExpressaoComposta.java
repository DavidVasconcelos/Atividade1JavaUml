package Calculadora;

public abstract class ExpressaoComposta {
	
	protected Expressao esquerda;
	protected Expressao direita;
	
	public ExpressaoComposta(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;				
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}	

}
