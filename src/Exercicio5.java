import java.util.Scanner;
//https://www.devmedia.com.br/entrada-de-dados-classe-scanner/21366

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade = ler.nextInt();
		

		if (idade >= 18) {
			System.out.println("Parabéns, você tem " + idade + " anos e é maior de idade");
		} else {
			System.out.println("Infelizmente, você é menor de idade, sorry :(");
		}

	}
}
