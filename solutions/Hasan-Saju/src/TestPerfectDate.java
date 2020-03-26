import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerfectDate {

    @Test
    public void NextDayTest()
        {
        PerfectDate p=new PerfectDate();
        p.setToday("1813/01/03");
        String expected="1813/01/04";
        String actual=p.NextDay();
        Assertions.assertEquals(expected,actual);
    }

}
