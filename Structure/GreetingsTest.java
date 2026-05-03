import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
    public void testThatGreetMethodReturnsAccurateGreeting() {
        String name = "Alice";
        String expected = Greetings.greet(name);
        String actual = "Hello, Alice!";
        assertEquals(actual, expected);

        name = "World";
        expected = Greetings.greet(name);
        actual = "Hello, World!";
        assertEquals(actual, expected);

        name = "";
        expected = Greetings.greet(name);
        actual = "Hello, !";
        assertEquals(actual, expected);
    }
}