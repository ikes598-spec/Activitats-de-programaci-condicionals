import java.util.Calendar;

public class AccesDiaHora {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_WEEK);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);

        if (dia == Calendar.SATURDAY) {
            System.out.println("NO pots entrar: és dissabte!");
        } else {
            if (dia == Calendar.SUNDAY) {
                System.out.println("No pots entrar: és diumenge!");
            } else {
                if (hora <= 8) {
                    System.out.println("No pots entrar: Encara no són es 08:00 hores!");
                } else {
                    System.out.println("Benvingut a l'aplicació!!");
                }
            }
        }
    }
}
