package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DemosClassesAtuaisLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        Instant instant = Instant.now();

        System.out.println("Data local = "+localDate +
                "\nData, hora, min, seg e milisegundos local = "+localDateTime+
                "\nData, hora, min, seg e milisegundos Londres GMT = "+instant);
        System.out.println("=============================================");

        LocalDate localDateParse = LocalDate.parse("2022-08-11");
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2022-08-11T12:30:10");

        Instant instantParseGMT = Instant.parse("2022-08-11T12:00:00Z");
        //Instant instantParseUTC = Instant.parse("2022-08-11T12:00:00-03:00");

        System.out.println(localDateParse);
        System.out.println(localDateTimeParse);
        System.out.println(instantParseGMT);
        //System.out.println(instantParseUTC.toString());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDate dateToFormatter = LocalDate.parse("10/01/2022",formatter);
        LocalDateTime dateToFormatter2 = LocalDateTime.parse("10/01/2022 12:00:00",formatter2);

        System.out.println(dateToFormatter) ;
        System.out.println(dateToFormatter2) ;

        LocalDate dateOf = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth() );
        System.out.println(dateOf);

        LocalDateTime dateOf2 = LocalDateTime.of(2022, 9, 11, 1, 30);
        System.out.println(dateOf2);

        Instant instant1 = instant;
        DateTimeFormatter formatterIso = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(instant1);
        System.out.println(formatterIso.format(instant1));
        System.out.println(formatter1.format(instant1));

    }
}
