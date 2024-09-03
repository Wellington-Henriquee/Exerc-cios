
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as 10 notas dos Alunos");
		int[] notas = new int[10];

		for (int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextInt();
			while (notas[i] < 0 || notas[i] > 10) {
				System.out.println("Nota inválida:" + " Digite uma nova nota");
				notas[i] = sc.nextInt();
			}

		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println("As Notas são: " + notas[i]);
		}
	}
}
