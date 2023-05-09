package assignment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateFormat {

    public static void main(String[] args) {

   //     DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE dd MM yyyy");
   //     ZoneId zoneId = ZoneId.of("America/NewYork");
   //     LocalDate currentDate = LocalDate.now(zoneId);
    //    System.out.println( "dateTimeFormat");
        Date thisDate =new Date();
        SimpleDateFormat dateForm =new SimpleDateFormat("EEE/dd/MMMM/yyyy/hh:mm a");
        System.out.println(dateForm.format(thisDate));

    }
}
