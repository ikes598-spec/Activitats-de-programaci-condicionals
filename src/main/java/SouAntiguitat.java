import java.util.Locale;
import java.util.Scanner;

public class SouAntiguitat {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introdueix el sou de l'operari:");
        double sou = teclat.nextDouble();
        System.out.println("Introdueix els anys d'antiguitat:");
        int antiguitat = teclat.nextInt();

        double souPagar = sou;
        if (sou < 500) {
            if (antiguitat >= 10) {
                souPagar *= 1.20;
            } else {
                souPagar *= 1.05;
            }
        }
        System.out.println("El sou a pagar és: " + souPagar);
        teclat.close();
    }
}
