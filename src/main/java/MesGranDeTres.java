import java.util.Scanner;

public class MesGranDeTres {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el primer número:");
        int primer = teclat.nextInt();
        System.out.println("Introdueix el segon número:");
        int segon = teclat.nextInt();
        System.out.println("Introdueix el tercer número:");
        int tercer = teclat.nextInt();

        System.out.println("El número més gran és: " + Math.max(primer, Math.max(segon, tercer)));
        teclat.close();
    }
}
