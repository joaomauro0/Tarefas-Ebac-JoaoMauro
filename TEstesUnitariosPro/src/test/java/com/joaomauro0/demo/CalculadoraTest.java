import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.adicionar(2, 3));
        assertEquals(-1, calc.adicionar(2, -3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(5, calc.subtrair(2, -3));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-6, calc.multiplicar(2, -3));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(6, 0));
    }
}
