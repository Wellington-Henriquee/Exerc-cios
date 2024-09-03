import java.util.Scanner;

public class exercicioFOR_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        int soma = 0;
        for (int i = 0; i <= valor; i++) {
        	soma = i + soma;  
        	
        }
          System.out.println("A soma é: " + soma);
		 
		
				
		
		
		
		
	}

}
/*
 * Crie um programa que soma todos os números inteiros entre 0 e um valor
 * informado pelo usuário
 */