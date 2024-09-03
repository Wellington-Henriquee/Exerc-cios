import java.util.Scanner;

public class exercicioFOR_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
  // a sobra do i dividido 3 tem que ser igual a zero
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

	}

}
/*
 * Faça um programa que mostra todos os números múltiplos de 3 entre 0 e 100
 */