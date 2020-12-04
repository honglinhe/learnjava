package CommonClass.Date;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class JDK8DateTest {
    /**
     * DateTimeFormatter: 格式化或解析日期、时间
     * SimpLeDateFormat
     */
    @Test
    public void test3(){
//        方式一：预定义的标准格式。如: ISO_LOCAL_DATE_TIME；ISO_LOCAL_DATE；ISO_LOCAL_TIME
        //格式化：日期->字符串
        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        String s = isoDateTime.format(now);
        //解析：字符串->日期
        TemporalAccessor parse = isoDateTime.parse(s);

//        方式二：本地化相关的格式。如: ofLocalizedDateTime（FormatStyle. LONG）
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String format = dateTimeFormatter.format(LocalDate.now());
//        方式三自定义的格式。如: ofPattern（"yyyy一MM一dd hh:mm:ss E"）
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String s1 = dateTimeFormatter1.format(LocalDateTime.now());
        System.out.println(s1);


    }

    /**
     * Instant
     *
     */
    @Test
    public void test2(){
        //now()获取的是本初子午线对应的标准时间
        Instant instant = Instant.now();
        //添加时间的偏移量
        instant.atOffset(ZoneOffset.ofHours(8));
        ////toEpochMilli（）:荻取自1970年1月1日0吋0分0秒（UTC）幵始的毫秒数
        long l = instant.toEpochMilli();
        //ofEpochMilli（）:通过给定的毫秒数，获取Instant实例
        Instant instant1 = Instant.ofEpochMilli(l);
    }
    /**
 *LocalDate、LocalTime、LocalDateTime
  */
    @Test
    public void test1(){
        //now():获取当前 日期 时间 日期加时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        //of（）:设置指定的年、月、日、时、分秒。没有偏移量
        LocalDateTime.of(2020,12,12,22,11);
        //getXxx():获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
        //体现了不可变性
        //withXxx（）：设置相关的的属性
        LocalDate localDate1 = localDate.withDayOfMonth(10);
        System.out.println(localDate);
        System.out.println(localDate1);
        //不可变性
        LocalDateTime localDateTime1 = localDateTime.plusDays(2);
        LocalDateTime localDateTime2 = localDateTime.minusHours(2);
    }

}
