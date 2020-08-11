import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String diaSemana = JOptionPane.showInputDialog("Digite o dia da semana");
		
		if (diaSemana.equalsIgnoreCase("sabado")  || diaSemana.equalsIgnoreCase("domingo")) {
			JOptionPane.showMessageDialog(null, "Vai caraii FDS chegou");
		} else {
			JOptionPane.showMessageDialog(null, "Da uma segurada mais um pokin");
		}
		

	}

}
