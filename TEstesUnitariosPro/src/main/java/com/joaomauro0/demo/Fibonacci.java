public class Fibonacci {

    public int calcularFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N não pode ser negativo.");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
