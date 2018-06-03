package Comum;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MediaSalarial {
	
	public static void main(String[] args) {
		try {

			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			Integer numeroFuncionarios = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o numero de funcion�rios para o c�lculo: "));

			Double[] arrayDeSalarios = new Double[numeroFuncionarios];
			Double soma = 0d;
			
			for (int i = 0; i < arrayDeSalarios.length; i++) {
				Double salario = Double
						.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio atual: "));
				
				
				arrayDeSalarios[i] = salario;
				soma += arrayDeSalarios[i];
			}
			
			

			JOptionPane.showMessageDialog(null, "A m�dia salarial � de " + soma/Double.valueOf(arrayDeSalarios.length), "Mensagem",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

}
