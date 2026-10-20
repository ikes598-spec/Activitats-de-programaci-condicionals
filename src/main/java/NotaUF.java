import java.util.Locale;
import java.util.Scanner;

public class NotaUF {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introdueix la nota de les activitats:");
        double activitats = teclat.nextDouble();
        System.out.println("Introdueix la nota de les proves:");
        double proves = teclat.nextDouble();

        double notaFinal = activitats * 0.10 + proves * 0.90;
        System.out.printf(Locale.US, "La nota final de la UF és: %.2f%n", notaFinal);
        if (notaFinal >= 5) {
            System.out.println("Has aprovat la UF!");
        } else {
            System.out.println("Has suspès la UF!");
        }

        teclat.close();
    }
}
