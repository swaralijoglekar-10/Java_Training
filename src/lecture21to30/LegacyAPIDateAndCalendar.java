package lecture21to30;

import java.util.Calendar;
import java.util.Date;
public class LegacyAPIDateAndCalendar {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        cal.set(2025, 04, 02);

        System.out.println(cal.getTime());
    }
}
