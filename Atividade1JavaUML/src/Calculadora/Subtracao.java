package Calculadora;

public class Subtracao extends ExpressaoComposta implements Expressao {
	
	public Subtracao(Expressao esquerda, Expressao direita) {
		super(esquerda,direita);
	}

	@Override
	public double avalia() {
		return esquerda.avalia() - direita.avalia();
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSubtracao(this);		
	}

}
