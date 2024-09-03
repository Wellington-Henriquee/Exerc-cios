import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite 10 numeros: ");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
  
		for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i]);
		}

	}
}
