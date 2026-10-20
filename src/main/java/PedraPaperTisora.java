import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisora {
    public static void main(String[] args) {
        String[] opcions = {"pedra", "paper", "tisora"};
        String ordinador = opcions[new Random().nextInt(opcions.length)];
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra pedra, paper o tisora:");
        String usuari = teclat.next().toLowerCase(Locale.ROOT);

        if (!usuari.equals("pedra") && !usuari.equals("paper") && !usuari.equals("tisora")) {
            System.out.println("Opció no vàlida");
        } else {
            System.out.println("Ordinador ha tret: " + ordinador);
            if (usuari.equals(ordinador)) {
                System.out.println("Heu empatat!!");
            } else if ((usuari.equals("pedra") && ordinador.equals("tisora"))
                    || (usuari.equals("paper") && ordinador.equals("pedra"))
                    || (usuari.equals("tisora") && ordinador.equals("paper"))) {
                System.out.println("Has guanyat!");
            } else {
                System.out.println("Has perdut!");
            }
        }
        teclat.close();
    }
}
