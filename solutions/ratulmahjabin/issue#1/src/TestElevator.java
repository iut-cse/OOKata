import com.sun.jmx.snmp.internal.SnmpSubSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestElevator {

    @Test

    public void test1() {


        Elevator lift = new Elevator();

        int button = 3;
        boolean expected = lift.call("Up");


        Assertions.assertEquals(expected, true);
    }


}
