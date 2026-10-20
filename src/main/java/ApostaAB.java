import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ApostaAB {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Apostes per A o per B ? : ");
        char aposta = Character.toUpperCase(teclat.next().charAt(0));

        String resultat;
        if (a == b) {
            resultat = "EMPAT!";
        } else if ((aposta == 'A' && a > b) || (aposta == 'B' && b > a)) {
            resultat = "HAS GUANYAT!!!";
        } else {
            resultat = "HAS PERDUT!";
        }
        System.out.printf(Locale.ROOT, "A treu un %d i B treu un %d %s%n", a, b, resultat);
        teclat.close();
    }
}
