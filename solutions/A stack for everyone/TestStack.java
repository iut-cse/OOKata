
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStack {
    @Test
    void AStackDemoWithInt() {
        Astack<Integer> stack = new Astack<>(10);
        stack.push(5);
        int item = stack.pop();
        Assertions.assertEquals(5, item);
    }

    @Test
    void AStackDemoWithString()
    {
        Astack<String> stack = new Astack<>(5);
        stack.push("IUT SWE 18 best!");
        String expected = "IUT SWE 18 best!";

        String actual = stack.pop();
        Assertions.assertEquals(expected,actual);
    }
}