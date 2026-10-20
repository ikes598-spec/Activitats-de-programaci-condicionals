import java.util.Locale;
import java.util.Scanner;

public class PreuEntradaCinema {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("És un dia laborable (L) o de cap de setmana (C)?");
        char dia = Character.toUpperCase(teclat.next().charAt(0));
        System.out.println("Tens Carnet Jove? (S/N):");
        char carnetJove = Character.toUpperCase(teclat.next().charAt(0));

        double preu = 5.0;
        if (dia == 'C') {
            preu *= 1.10;
        }
        if (carnetJove == 'S') {
            preu *= 0.85;
        }
        System.out.printf(Locale.US, "El preu de l'entrada és: %.2f €%n", preu);

        teclat.close();
    }
}
