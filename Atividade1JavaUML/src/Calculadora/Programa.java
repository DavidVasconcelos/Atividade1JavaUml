package Calculadora;

public class Programa {

	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao( new Multiplicacao(new Numero(5.2), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma =  new Soma(esquerda, direita);
		
		double resultado = soma.avalia();		
		
		Visitor impressora = new ImpressoraVisitor();
		
		soma.aceita(impressora);
		
		System.out.print(" = " + resultado);
	}

}
