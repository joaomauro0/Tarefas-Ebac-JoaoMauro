import java.util.Scanner;

public class Exercicio2 {
    public static int calcularFatorial(int n) {
        int[] fatorial = new int[n + 1];
        fatorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            fatorial[i] = i * fatorial[i - 1];
        }
        return fatorial[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial:");
        int numero = scanner.nextInt();

        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);

        scanner.close();
    }
}
