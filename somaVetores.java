import java.util.Scanner;

public class somaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números irá Digitar?");
		int N = sc.nextInt();
		double[] vect = new double[N];
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um Número");
			vect[i] = sc.nextDouble();

		}
		System.out.println("Valores = " + vect[0] + " " + vect[1] + " " + vect[2] + " " + vect[3]);
		double soma = 0;
		double media = 0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		media = soma / N;
		System.out.println("Soma = " + soma);
		System.out.println("Media= " + media);
	}

}
