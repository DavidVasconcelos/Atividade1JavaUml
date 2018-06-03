package Comum;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Fatorial {

	public static void main(String[] args) {

		try {

			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			Integer numero = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o numero para cálculo do fatorial: "));

			Integer resultado = fatorial(numero);

			JOptionPane.showMessageDialog(null, "O Fatorial de " + numero + " é: " + resultado, "Mensagem",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	static Integer fatorial(int n) {
		return (n == 1) ? 1 : n * fatorial(n - 1);
	}

}
