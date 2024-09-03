import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros ira digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero");
			vect[i] = sc.nextDouble();
		}
		double soma = 0;
		System.out.println("Números Negativos");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				soma = vect[i];
				System.out.println(soma);
			}
		}

	}
}
