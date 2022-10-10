package com.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Hakim
 */
public class TimeInfo {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        
        String date=LocalDate.now().format(dateFormatter);
        String time=LocalTime.now().format(timeFormatter);
        ZoneId zoneId = ZoneId.systemDefault();
        
        LocalDateTime dateTime=LocalDateTime.now();
        ZonedDateTime atZone = dateTime.atZone(zoneId);
        ZoneOffset zoneOffset=atZone.getOffset();
                
        String result="""
        +-------------------+----------------------+
        Date       : %s             
        --------------------------------------------
        Time       : %s
        --------------------------------------------
        Zone Id    : %s
        --------------------------------------------
        Zone Offset: %s
        +-------------------+-----------------------+
                      """.formatted(date,time,zoneId.toString(),zoneOffset.toString());
        
        System.out.println(result);
        
    }
}
