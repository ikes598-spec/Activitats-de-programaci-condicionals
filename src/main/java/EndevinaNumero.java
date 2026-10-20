import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
        int numeroPensat = new Random().nextInt(10) + 1;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Endevina el número que he pensat (està entre 1 i 10!):");
        int intent = teclat.nextInt();

        if (intent == numeroPensat) {
            System.out.println("Enhorabona, l'has endevinat!");
        } else {
            System.out.println("Ho sento, havia generat el número " + numeroPensat + "!");
        }
        teclat.close();
    }
}
