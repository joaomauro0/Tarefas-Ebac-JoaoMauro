public class Wrapper {


        public static void main(String[] args) {
            // Primitivo int
            int primitivo = 10;

            // Convertendo para Integer (Wrapper)
            Integer wrapper = Integer.valueOf(primitivo);

            // Imprimindo o valor do Wrapper
            System.out.println("Valor do wrapper(Integer): " + wrapper);

            float primitivo2 = 10.5f;

            Float wrapper2 = Float.valueOf(primitivo2);

            System.out.println("valor do wrapper (Float):" + wrapper2);

        }

    }


