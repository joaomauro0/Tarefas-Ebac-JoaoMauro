public class Exercicio3 {
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2); // Chamada recursiva
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Fibonacci(" + i + ") = " + calcularFibonacci(i));
        }
    }
}
