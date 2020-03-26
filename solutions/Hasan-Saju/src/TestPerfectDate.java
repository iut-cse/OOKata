import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerfectDate {

    @Test
    public void NextDayTest1()
        {
        PerfectDate p=new PerfectDate();
        p.setToday("1813/01/03");
        String expected="1813/01/04";
        String actual=p.NextDay();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void NextDayTest2()
    {
        PerfectDate p=new PerfectDate();
        p.setToday("1813/01/32");
        String expected="1813/02/01";
        String actual=p.NextDay();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void NextDayTest3()
    {
        PerfectDate p=new PerfectDate();
        p.setToday("1813/08/32");
        String expected="1814/01/01";
        String actual=p.NextDay();
        Assertions.assertEquals(expected,actual);
    }

}
