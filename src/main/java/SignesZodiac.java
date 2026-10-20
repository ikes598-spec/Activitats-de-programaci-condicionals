import java.util.Scanner;

public class SignesZodiac {
    public static void main(String[] args) {
        System.out.println("1. Àries      2. Capricorn   3. Balança     4. Cranc");
        System.out.println("5. Lleó       6. Taure       7. Aquari      8. Escorpió");
        System.out.println("9. Sagitari   10. Verge      11. Bessons    12. Peixos");
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el número del teu signe:");
        int signe = teclat.nextInt();

        String categoria = switch (signe) {
            case 1, 5, 9 -> "Foc";
            case 2, 6, 10 -> "Terra";
            case 3, 7, 11 -> "Aire";
            case 4, 8, 12 -> "Aigua";
            default -> null;
        };
        if (categoria == null) {
            System.out.println("ERROR: " + signe + " no associat a cap signe.");
        } else {
            System.out.println("Categoria: " + categoria);
        }
        teclat.close();
    }
}
