import java.util.Scanner;

public class RectangleQuadrat {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el costat gran del rectangle:");
        int costatGran = teclat.nextInt();
        System.out.println("Introdueix el costat petit del rectangle:");
        int costatPetit = teclat.nextInt();

        int perimetre = costatGran * 2 + costatPetit * 2;
        int area = costatGran * costatPetit;
        System.out.println("Perímetre del rectangle = " + perimetre);
        System.out.println("Àrea del rectangle = " + area);
        if (costatGran == costatPetit) {
            System.out.println("És un quadrat");
        } else {
            System.out.println("No és un quadrat");
        }

        teclat.close();
    }
}
