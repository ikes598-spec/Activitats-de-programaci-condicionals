import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix una quantitat (cèntims euro):");
        int quantitat = teclat.nextInt();

        if (quantitat < 0) {
            System.out.println("La quantitat ha de ser igual o superior a 0");
        } else {
            int[] valors = {200, 100, 50, 20, 10, 5, 2, 1};
            String[] noms = {"de 2 euros", "d'1 euro", "de 50 cèntims", "de 20 cèntims",
                    "de 10 cèntims", "de 5 cèntims", "de 2 cèntims", "d'1 cèntim"};
            for (int i = 0; i < valors.length; i++) {
                int nombreMonedes = quantitat / valors[i];
                if (nombreMonedes > 0) {
                    String moneda = nombreMonedes == 1 ? "moneda " : "monedes ";
                    System.out.println(nombreMonedes + " " + moneda + noms[i]);
                    quantitat %= valors[i];
                }
            }
        }
        teclat.close();
    }
}
