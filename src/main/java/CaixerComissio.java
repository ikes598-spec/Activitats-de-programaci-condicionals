import java.util.Locale;
import java.util.Scanner;

public class CaixerComissio {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introdueix el saldo actual:");
        double saldo = teclat.nextDouble();
        System.out.println("Introdueix la quantitat a treure:");
        double quantitat = teclat.nextDouble();
        System.out.println("Fas servir caixer propi? (S/N):");
        char caixerPropi = teclat.next().charAt(0);

        double comissio = Character.toUpperCase(caixerPropi) == 'S' ? 0 : quantitat * 0.05;
        double total = quantitat + comissio;
        if (total > saldo) {
            System.out.println("No es pot fer la retirada. Saldo insuficient.");
        } else {
            System.out.printf(Locale.US, "Quantitat a treure: %.1f €%n", quantitat);
            if (comissio > 0) {
                System.out.printf(Locale.US, "Comissió: %.1f €%n", comissio);
            }
            System.out.printf(Locale.US, "Saldo restant: %.1f €%n", saldo - total);
        }

        teclat.close();
    }
}
