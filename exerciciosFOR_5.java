import java.util.Scanner;
public class exerciciosFOR_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int valor = 1;
		for (int i = 1; i <= 10; i++) {
			valor = i * numero;
			System.out.println("A mutiplição é: " + valor);
		}

	}

}
