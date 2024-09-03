import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		int numero = sc.nextInt();

		String[] numeroP = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
				"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };
		String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sesenta", "setenta", "oitenta",
				"noventa" };
		if (numero >= 0 && numero <= 100) {
			if (numero < 20) {
				System.out.println(numeroP[numero]);
			} else if (numero == 100) {
				System.out.println("cem"); 
			} else {
				int dezena = numero / 10;
				int unid =  numero % 10;
				if(unid == 0) {
					System.out.println(dezenas [dezena]);
				} else {
					System.out.println(dezenas [dezena] + " e " + numeroP[unid]);
				}
					
			}
		}
	}
}