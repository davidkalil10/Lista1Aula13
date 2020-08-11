import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temHabilitacao = JOptionPane.showInputDialog("Você tem habilitação? Sim ou Não?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

		if (temHabilitacao.equalsIgnoreCase("sim")) {
			if (idade >= 18) {
				JOptionPane.showMessageDialog(null, "Congrats, taca-lhe pau Hemmilton");
			} else {
				JOptionPane.showMessageDialog(null, "Calma, completa 18 primeiro parça");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Vai pra auto escola bro");
		}

	}

}
