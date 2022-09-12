package datas;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateLegada {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 =  new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date date1 = sdf1.parse("25/06/2022");
        Date date2 = sdf2.parse("25/06/2022 10:23:01");

        System.out.println(date1);
        System.out.println(date2);

        System.out.println(sdf1.format(date1));
        System.out.println(sdf2.format(date2));

        System.out.println("===========================");

        Date data1 = new Date();
        Date data2 = new Date(System.currentTimeMillis());
        Date data3 = new Date(0L);
        Date data4 = new Date(1000L * 60 * 60  * 5L);
        Date data5 = Date.from(Instant.parse("2022-09-11T10:00:01Z"));

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(sdf1.format(data4));
        System.out.println(sdf2.format(data5));
    }
}
