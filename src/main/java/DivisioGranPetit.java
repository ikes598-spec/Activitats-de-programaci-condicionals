import java.util.Scanner;

public class DivisioGranPetit {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el primer número:");
        int primer = teclat.nextInt();
        System.out.println("Introdueix el segon número:");
        int segon = teclat.nextInt();

        if (primer == segon) {
            System.out.println("Els números han de ser diferents");
        } else {
            int gran = Math.max(primer, segon);
            int petit = Math.min(primer, segon);
            if (petit == 0) {
                System.out.println("El divisor no pot ser 0");
            } else {
                System.out.println("El resultat de dividir " + gran + " entre " + petit
                        + " és: " + ((double) gran / petit));
            }
        }

        teclat.close();
    }
}
