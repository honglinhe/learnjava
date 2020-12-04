package CommonClass.Date;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    @Test
    public void testCalendar(){


        GregorianCalendar calendar1 = new GregorianCalendar();
        System.out.println(calendar1.getClass());
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getClass());

    }
}
