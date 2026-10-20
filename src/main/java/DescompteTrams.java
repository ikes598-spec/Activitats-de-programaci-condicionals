import java.util.Locale;
import java.util.Scanner;

public class DescompteTrams {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introdueix una quantitat:");
        double quantitat = teclat.nextDouble();

        double descompte;
        if (quantitat < 500) {
            descompte = 0.05;
        } else if (quantitat < 1000) {
            descompte = 0.08;
        } else if (quantitat <= 5000) {
            descompte = 0.15;
        } else {
            descompte = 0.25;
        }
        System.out.println("El resultat és: " + (quantitat * (1 - descompte)));
        teclat.close();
    }
}
