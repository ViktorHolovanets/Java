package Lambda1;

import Lambda1.interfaces.DifferenceDate;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class LambdaAppLib {
    public static boolean leapYear(int year) {
        Year year1 = Year.parse(String.valueOf(year), DateTimeFormatter.ofPattern("y"));
        return year1.isLeap();
    }

    public static long differenceDate(String date, String date1) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(date, formatter);
        LocalDate endDate = LocalDate.parse(date1, formatter);
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public int getDay(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(2023,01,01));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        return dayOfWeek;
    }
}
