import java.util.Scanner;

public class Exercicio1 {
    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        }
        return n * calcularFatorial(n - 1); // Chamada recursiva
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
