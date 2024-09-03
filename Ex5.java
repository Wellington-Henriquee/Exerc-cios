import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int N = sc.nextInt();

		while (N != 1) {
			if (N % 2 == 0) {
				N = N / 2;
			} else {
				N = N * 3 + 1;
			}
			System.out.println("O valor do Collatz é: " + N);
		}

	}

}
