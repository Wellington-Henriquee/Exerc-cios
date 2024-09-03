
import java.util.Scanner;
import java.util.Arrays;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];

		System.out.println("Digite os números da array:");
		for (int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		System.out.println("Elementos únicos no array:");

		if (array[0] != array[1]) {
			System.out.println(array[0]);
		}
		 
		for (int i = 1; i < 9; i++) {
			if (array[i] != array[i - 1] && array[i] != array[i + 1]) {
				System.out.println(array[i]);
			}
		}
		
		
		if (array[9] != array[8]) {
			System.out.println(array[9]);
		}
		sc.close();
	}
}