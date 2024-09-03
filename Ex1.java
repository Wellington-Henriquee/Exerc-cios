
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
		String texto = sc.nextLine();

		String novoTexto = "";

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c != ' ') {
				novoTexto += c;
			}
		}

		boolean palin = true;

		int length = novoTexto.length() - 1;
 
		for (int i = 0; i < length; i++) {
			char inicio = novoTexto.charAt(i);
			char fim = novoTexto.charAt(length - i);
			if (inicio != fim) {
				palin = false;
				break;
			}
		}
		if (palin == true) {
			System.out.println(texto + " é um palíndromo.");
		} else {
			System.out.println(texto + " não é um palíndromo.");
		}
		sc.close();
	}
}