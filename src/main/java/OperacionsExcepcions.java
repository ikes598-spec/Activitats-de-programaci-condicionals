import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionsExcepcions {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        try {
            System.out.println("Introdueix el primer número enter:");
            int primer = teclat.nextInt();
            System.out.println("Introdueix el segon número enter:");
            int segon = teclat.nextInt();

            System.out.println(primer + " + " + segon + " = " + (primer + segon));
            System.out.println(primer + " - " + segon + " = " + (primer - segon));
            System.out.println(primer + " * " + segon + " = " + (primer * segon));
            if (segon == 0) {
                System.out.println("Error: no es pot dividir per zero");
            } else {
                System.out.println(primer + " / " + segon + " = " + (primer / segon));
            }
        } catch (InputMismatchException excepcio) {
            System.out.println("Error: has d'introduir números enters");
        } finally {
            teclat.close();
        }
    }
}
