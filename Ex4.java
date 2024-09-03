import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int paisA = 9000;
		int paisB = 20000;
		double taxaA = 0.03;
		double taxaB = 0.015;
		int soma = 0;
		while (paisA < paisB) {
			paisA *= (1 + taxaA);
			paisB *= (1 + taxaB);
			soma++;
		}
		System.out.println("para que a população do país A ultrapasse o país B será necessário: "+ soma + " Anos");
	}

}
