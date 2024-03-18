import java.util.Scanner;

public class ControleDeFluxo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua nota");

        int nota = s.nextInt();
        String notaSt = getNota(nota);
        System.out.println(notaSt);
    }

    public static String getNota(int nota) {
        if (nota >= 7) {
            return "Você passou!";
        } else if (nota >= 5) {
            return "Você está de recuperação";
        } else {
            return "Você reprovou!";
        }
    }
}
