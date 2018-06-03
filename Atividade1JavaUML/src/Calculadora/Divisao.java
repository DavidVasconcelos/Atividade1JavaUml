package Calculadora;

public class Divisao extends ExpressaoComposta implements Expressao {
	
	public Divisao(Expressao esquerda, Expressao direita) {
		super(esquerda,direita);
	}

	@Override
	public double avalia() {
		return esquerda.avalia() / direita.avalia();
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaDivisao(this);			
	}

}
