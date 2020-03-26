import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestToy {

    @Test
    public void TestThor()
    {
        Thor t=new Thor();
        String expected="Bump";
        String actual=t.soundOfWeapon();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestDogverine()
    {
        Dogverine d=new Dogverine();
        String expected="Slash";
        String actual=d.soundOfWeapon();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestWhiteShadow()
    {
        WhiteShadow w=new WhiteShadow();
        String expected="Pew pew";
        String actual=w.soundOfWeapon();
        Assertions.assertEquals(expected,actual);
    }
}
