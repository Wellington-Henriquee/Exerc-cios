import java.util.Scanner;

public class exercicioFOR_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double fatorial = 1;
		for (int i = 1; i <= N; i++) {
			fatorial = fatorial * i;
		}

		System.out.println("O valor da fatorial È: " + fatorial);

	}

}
/*
 * Crie uma função para exibir o fatorial de um número informado pelo usuário
 */