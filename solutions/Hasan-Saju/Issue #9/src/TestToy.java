import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestToy {

    @Test
    public void TestThor()
    {
        Toy t=new Thor(2,"Slim","Hammer");//Toy er reference banano jay but object banano jabe na
        String expected="Bump";
        String actual=t.soundOfWeapon();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestDogverine()
    {
        Dogverine d=new Dogverine(5,"Small","Knives");
        String expected="Slash";
        String actual=d.soundOfWeapon();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestWhiteShadow()
    {
        WhiteShadow w=new WhiteShadow(1,"Thin","Gun");
        String expected="Pew pew";
        String actual=w.soundOfWeapon();
        Assertions.assertEquals(expected,actual);
    }
}
