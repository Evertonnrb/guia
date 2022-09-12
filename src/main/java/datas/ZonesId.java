package datas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ZonesId {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2022-12-25T11:59:59Z");
        System.out.println("Hora do natal em londres : "+instant);
        System.out.println("NATAL em londres em cg ms é : "+LocalDateTime.ofInstant(instant,ZoneId.of("America/Campo_Grande")));
        System.out.println("NATAL em londres em portugal será : "+LocalDateTime.ofInstant(instant,ZoneId.of("Portugal")));
        for (String s : ZoneId.getAvailableZoneIds()){
           // System.out.println(s);
        }

    }
}
