import java.util.Scanner;

public class EntreU10Parell {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número enter:");
        int numero = teclat.nextInt();

        if (numero >= 1 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("El número està entre 1 i 10 i és parell");
            } else {
                System.out.println("El número està entre 1 i 10 però és senar");
            }
        } else {
            System.out.println("El número no està entre 1 i 10");
        }

        teclat.close();
    }
}
