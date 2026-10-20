import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introdueix altura en cm:");
        double alturaMetres = teclat.nextDouble() / 100.0;
        System.out.println("Introdueix pes en kg:");
        double pes = teclat.nextDouble();

        double imc = pes / (alturaMetres * alturaMetres);
        System.out.printf(Locale.US, "L'IMC és: %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Classificació (OMS): Pes insuficient");
        } else if (imc < 25.0) {
            System.out.println("Classificació (OMS): Pes normal");
        } else if (imc < 30.0) {
            System.out.println("Classificació (OMS): Sobrepès");
        } else {
            System.out.println("Classificació (OMS): Obesitat");
        }

        teclat.close();
    }
}
