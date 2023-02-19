package Lambda1;

import Lambda1.interfaces.DifferenceDate;
import Lambda1.interfaces.GetWeeks;
import Lambda1.interfaces.LeapYear;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Task1 implements Runnable {
    @Override
    public void run() {
        // task 1
        LeapYear leapYear = LambdaAppLib::leapYear;
        if (leapYear.isLeapYear(1900))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");

        //task 2
        DifferenceDate day = LambdaAppLib::differenceDate;
        var date = new Date();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String d = simpleDateFormat.format(date);
        System.out.println(day.difference(d, "21/02/2023"));

        //task 3
        GetWeeks getWeeks=((startDate, endDate, differenceDate) -> (int)differenceDate.difference(startDate,endDate)/7);
        System.out.println(getWeeks.getWeeks(d,"21/02/2023",LambdaAppLib::differenceDate));

        Calendar c = Calendar.getInstance();
        c.setTime(new Date(2023,01,01));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }

}
