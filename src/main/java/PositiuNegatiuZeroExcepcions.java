import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiuNegatiuZeroExcepcions {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        try {
            System.out.println("Introdueix un número:");
            int numero = teclat.nextInt();

            if (numero > 0) {
                System.out.println("El número és positiu");
            } else if (numero < 0) {
                System.out.println("El número és negatiu");
            } else {
                System.out.println("El número és zero");
            }
        } catch (InputMismatchException excepcio) {
            System.out.println("Error: has d'introduir un número enter");
        } finally {
            teclat.close();
        }
    }
}
