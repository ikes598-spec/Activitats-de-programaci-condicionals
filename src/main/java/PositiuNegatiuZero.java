import java.util.Scanner;

public class PositiuNegatiuZero {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número:");
        int numero = teclat.nextInt();

        if (numero > 0) {
            System.out.println("El número és positiu");
        } else if (numero < 0) {
            System.out.println("El número és negatiu");
        } else {
            System.out.println("El número és zero");
        }

        teclat.close();
    }
}
