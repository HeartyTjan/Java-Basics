package codingChallenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    public void testPush() {
        StackCustom stack = new StackCustom();
        stack.push(1);
        ArrayList<Integer>result = stack.push(2);
        assertEquals(result,stack.push(2));
    }
    @Test
    public void testPop() {
        StackCustom stack = new StackCustom();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int result = stack.pop();
        assertEquals(result,3);
    }

    @Test
    public void testPeek() {
        StackCustom stack = new StackCustom();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int result = stack.peek();
        assertEquals(result,3);
    }
    @Test
    public void testIsEmpty() {
        StackCustom stack = new StackCustom();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        boolean result = stack.isEmpty();
        assertEquals(result,false);
    }
}
