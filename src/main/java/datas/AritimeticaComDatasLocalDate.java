package datas;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class AritimeticaComDatasLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2022-07-07");
        LocalDateTime localDateTime = LocalDateTime.parse("2022-07-07T12:30:30");
        LocalDateTime localDateTime2 = LocalDateTime.parse("2022-07-14T12:30:30");
        Instant instant = Instant.parse("2022-07-07T12:30:30Z");

        System.out.println(date);
        System.out.println(date.plusMonths(1));
        System.out.println(date.minusDays(3));
        System.out.println(date.plusDays(7));

        System.out.println(localDateTime);
        System.out.println(localDateTime.plusMinutes(30));
        System.out.println(localDateTime.plusHours(1));
        System.out.println(localDateTime.minusMonths(1));

        System.out.println(instant);
        System.out.println(instant.plus(7, ChronoUnit.HOURS));
        System.out.println(instant.plus(7, ChronoUnit.DAYS));

        Duration duration = Duration.between(localDateTime, localDateTime.plusDays(7));
        Duration duration1 = Duration.between(localDateTime, localDateTime2);
        System.out.println(duration.toDays());
        System.out.println(duration1.toMinutes());


    }
}
