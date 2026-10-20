import java.util.Scanner;

public class DiesDelMes {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número de mes (1-12):");
        int mes = teclat.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Aquest mes té 31 dies");
            case 4, 6, 9, 11 -> System.out.println("Aquest mes té 30 dies");
            case 2 -> System.out.println("Aquest mes té 28 dies");
            default -> System.out.println("Número de mes no vàlid");
        }
        teclat.close();
    }
}
