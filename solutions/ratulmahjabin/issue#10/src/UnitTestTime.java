import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTestTime {

    @Test
    void testLastDayOfTheMonth()
    {
        PerfectDate date = new PerfectDate(1813, 1, 32);

        String expected  = "1813/02/01";

        Assertions.assertEquals(expected, date.nextDay());
    }

    @Test
    void testLastDayOfTheYear()
    {
        PerfectDate date = new PerfectDate(1813, 8, 32);

        String expected  = "1814/01/01";

        Assertions.assertEquals(expected, date.nextDay());
    }


    @Test
    void testNotLastDay()
    {
        PerfectDate date = new PerfectDate(1813, 1, 3);

        String expected  = "1813/01/04";

        Assertions.assertEquals(expected, date.nextDay());
    }


}
