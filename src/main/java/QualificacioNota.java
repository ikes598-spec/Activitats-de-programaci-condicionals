import java.util.Locale;
import java.util.Scanner;

public class QualificacioNota {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introdueix una nota:");
        double nota = teclat.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota ha de ser entre 0 i 10");
        } else if (nota >= 9) {
            System.out.println("Excel·lent");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 6) {
            System.out.println("Bé");
        } else if (nota >= 5) {
            System.out.println("Suficient");
        } else {
            System.out.println("Insuficient");
        }
        teclat.close();
    }
}
