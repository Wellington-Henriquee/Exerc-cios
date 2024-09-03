
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];

        System.out.println("Digite as notas N1, N2, N3 e Af:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("N" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        notas[0] *= 0.15;
        notas[1] *= 0.30;
        notas[2] *= 0.10;
        notas[3] *= 0.45;

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double menorNota = Math.min(Math.min(notas[0], notas[1]), Math.min(notas[2], notas[3]));

        System.out.println("Nota final: " + soma);

        System.out.println("Sua menor nota é: " + menorNota + ", deseja fazer a substituição? (Y or N)");
        String resp = sc.next();

        if (resp.contains("Y") || resp.contains("y")) {
            System.out.println("Digite a nova nota: ");
            double novaNota = sc.nextDouble();
            
            if (menorNota == notas[0]) {
                notas[0] = novaNota * 0.15;
            } else if (menorNota == notas[1]) {
                notas[1] = novaNota * 0.30;
            } else if (menorNota == notas[2]) {
                notas[2] = novaNota * 0.10;
            } else {
                notas[3] = novaNota * 0.45;
            }

            soma = 0;
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            System.out.println("Nova nota final: " + soma);
        } else {
            System.out.println("Nota final inalterada!");
        }

        sc.close();
    }
}