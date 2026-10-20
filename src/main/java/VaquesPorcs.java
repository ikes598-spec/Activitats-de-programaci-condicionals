import java.util.Scanner;

public class VaquesPorcs {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Quants vaques hi ha a la granja?");
        int vaques = teclat.nextInt();
        System.out.println("Quants porcs hi ha a la granja?");
        int porcs = teclat.nextInt();

        int total = vaques + porcs;
        if (total == 0) {
            System.out.println("No hi ha animals a la granja.");
        } else {
            int percentatgeVaques = (int) Math.round(100.0 * vaques / total);
            int percentatgePorcs = (int) Math.round(100.0 * porcs / total);
            System.out.printf("El percentatge és: %d%% de vaques i %d%% de porcs.%n",
                    percentatgeVaques, percentatgePorcs);

            if (vaques > porcs) {
                System.out.println("Hi ha més vaques que porcs!");
            } else if (porcs > vaques) {
                System.out.println("Hi ha més porcs que vaques!");
            } else {
                System.out.println("Hi ha el mateix nombre de vaques que de porcs!");
            }
        }

        teclat.close();
    }
}
