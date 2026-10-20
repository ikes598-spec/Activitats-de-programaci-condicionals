import java.util.Scanner;

public class LoginUsuariPassword {
    public static void main(String[] args) {
        // Informació secreta
        final String username = "cponts";
        final String password = "qw34T1234";

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el nom d'usuari:");
        String usuariIntroduit = teclat.nextLine();
        System.out.println("Introdueix la contrasenya:");
        String passwordIntroduit = teclat.nextLine();

        if (username.equals(usuariIntroduit) && password.equals(passwordIntroduit)) {
            System.out.println("Usuari i contrasenya correctes!");
        } else {
            System.out.println("Usuari o contrasenya incorrectes!");
        }
        teclat.close();
    }
}
