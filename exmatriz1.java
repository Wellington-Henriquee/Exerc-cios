import java.util.Scanner;

public class exmatriz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[10][10];
		int conta = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = conta;
				conta++;

			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				System.out.println(mat[i][j]);
			}
		}

	}

}
