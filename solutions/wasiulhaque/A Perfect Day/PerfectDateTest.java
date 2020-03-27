import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PerfectDateTest {

    @Test
    public void example1(){
        PerfectDate perfectDate = new PerfectDate(1813,1,3);
        String actual = perfectDate.nextDay();
        String expected = "1813/01/04";
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void example2(){
        PerfectDate perfectDate = new PerfectDate(1813,1,32);
        String actual = perfectDate.nextDay();
        String expected = "1813/02/01";
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void example3(){
        PerfectDate perfectDate = new PerfectDate(1813,8,32);
        String actual = perfectDate.nextDay();
        String expected = "1814/01/01";
        Assertions.assertEquals(expected,actual);
    }
}
