package Calculadora;

public class Multiplicacao extends ExpressaoComposta implements Expressao {

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		super(esquerda, direita);
	}

	@Override
	public double avalia() {
		return esquerda.avalia() * direita.avalia();
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaMultiplicacao(this);
	}

}
