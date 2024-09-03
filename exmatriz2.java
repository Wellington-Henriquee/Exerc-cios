import java.util.Scanner;

public class exmatriz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();

			}
		}
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j < matriz.length;j++) {
				System.out.print(matriz[i] [j] + " " );
			}
			System.out.println(" ");
		}

		sc.close();
	}
	/*- Crie um programa que cria uma matriz 5x5, e preenche todos os
	elementos com números informados pelo usuário*/
}
