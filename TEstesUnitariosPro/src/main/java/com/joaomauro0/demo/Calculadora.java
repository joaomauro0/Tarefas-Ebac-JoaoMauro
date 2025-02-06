/**
 * Classe Calculadora que realiza operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da soma.
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param a Minuendo.
     * @param b Subtraendo.
     * @return Resultado da subtração.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da multiplicação.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado da divisão.
     * @throws IllegalArgumentException se b for zero.
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
