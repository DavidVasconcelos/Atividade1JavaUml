package Calculadora;

public class Soma extends ExpressaoComposta implements Expressao {	

	public Soma(Expressao esquerda, Expressao direita) {
		super(esquerda,direita);
	}

	@Override
	public double avalia() {
		return esquerda.avalia() + direita.avalia();
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);		
	}
	 

}
