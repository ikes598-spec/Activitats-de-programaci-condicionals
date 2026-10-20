import java.util.Calendar;

public class AccesPerHora {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour > 8) {
            System.out.println("Pots accedir");
        }
    }
}
