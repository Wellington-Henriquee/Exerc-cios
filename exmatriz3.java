import java.util.Scanner;

public class exmatriz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         
		int[][] matriz = new int[5][5]; 
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
 				
				if (matriz[i] == matriz[j]) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.print(soma + " ");

	}

}
/* Calcule a somatória da diagonal principal da matriz */