
public class Ex13 {
	public static void main(String[] args) {
		String texto = "Digite aqui um texto";
		int count = 10;

		for (int i = 0; i <= texto.length() - count; i++) {
			for (int j = i; j < i + count; j++) {
				System.out.print(texto.charAt(j));
			}
			System.out.println();
		}
	}
}