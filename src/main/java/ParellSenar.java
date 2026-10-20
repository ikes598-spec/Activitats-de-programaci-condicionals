import java.util.Scanner;

public class ParellSenar {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un número enter:");
        int numero = teclat.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número és parell");
        } else {
            System.out.println("El número és senar");
        }

        teclat.close();
    }
}
