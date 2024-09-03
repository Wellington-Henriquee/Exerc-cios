import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		System.out.println("Digite 10 números para o array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Digite o número q:");
		int q = sc.nextInt();
		sc.close();

		boolean encontrado = false;  
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == q) { 
					System.out.println("Par encontrado: " + array[i] + " e " + array[j]);
					encontrado = true;
					break; 
				}
			}
			if (encontrado)
				break; 
		}

		if (!encontrado) {
			System.out.println("Não existe um par cuja soma é igual a " + q);
		}
	}
}
