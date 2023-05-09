package day6;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {
        //current date
        boolean specificDate = false;
        LocalDate currentLocalDate = LocalDate.now();


        int year = 123;
        int month = 3;
        int day = 23;
        System.out.println(specificDate);

        //format date on user readable

        Date thisDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE dd MM yyyy");
        ZoneId zoneId = ZoneId.of("America/NewYork");
        System.out.println("DateTimeFormatter");

    }
}
