import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calcularFibonacci(0));
    }

    @Test
    public void testFibonacciUm() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.calcularFibonacci(1));
    }

    @Test
    public void testFibonacciCinco() {
        Fibonacci fib = new Fibonacci();
        assertEquals(5, fib.calcularFibonacci(5));
    }

    @Test
    public void testFibonacciValorNegativo() {
        Fibonacci fib = new Fibonacci();
        assertThrows(IllegalArgumentException.class, () -> fib.calcularFibonacci(-1));
    }
}
