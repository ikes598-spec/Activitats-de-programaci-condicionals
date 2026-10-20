import java.util.Scanner;

public class NomDelMes {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número de mes (1-12):");
        int mes = teclat.nextInt();

        switch (mes) {
            case 1 -> System.out.println("Gener");
            case 2 -> System.out.println("Febrer");
            case 3 -> System.out.println("Març");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maig");
            case 6 -> System.out.println("Juny");
            case 7 -> System.out.println("Juliol");
            case 8 -> System.out.println("Agost");
            case 9 -> System.out.println("Setembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Novembre");
            case 12 -> System.out.println("Desembre");
            default -> System.out.println("Número de mes no vàlid");
        }
        teclat.close();
    }
}
