import java.util.Scanner;
import java.util.Locale;

public class Febre {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        teclat.useLocale(Locale.US);

        System.out.println("Entra la temperatura:");
        double temperatura = teclat.nextDouble();

        if (temperatura > 37) {
            System.out.println("Tens febre, has d'anar cap a casa a descansar!!");
        } else {
            System.out.println("No tens febre");
        }

        teclat.close();
    }
}
