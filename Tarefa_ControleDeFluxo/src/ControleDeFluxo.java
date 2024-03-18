import java.util.Scanner;
import java.lang.String;

public class ControleDeFluxo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int acumulador = 0;
        System.out.println("Digite sua nota");


        int i;
        for (i = 0; i < 4; i++) {
            int nota = s.nextInt();
            acumulador = acumulador + nota;
        }
        int media = acumulador / i;
        String notaSt = getNota(media);
        media = acumulador / 4;
        System.out.println(notaSt);
    }


    public static String getNota(int media) {
        if (media >= 7) {
            return "Você passou!";
        } else if (media >= 5) {
            return "Você está de recuperação";
        } else {
            return "Você reprovou!";
        }
    }
}
