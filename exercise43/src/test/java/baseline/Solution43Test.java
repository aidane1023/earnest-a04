package baseline;

import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    @Test
    void test_fileWrite() {
        String test = "testCase.txt";
        FileWriter output = null;
        try {
            output = new FileWriter(String.valueOf(new FileWriter(test)));
            output.write("passed");
        } catch (IOException e) {
            System.out.println("error, test failed");
        }
        finally {
            assertNotNull(output);
        }
    }

    @Test
    void test_conditional1() {
        String conditional = "y";
        String changeCase = conditional.toUpperCase();
        assertTrue(changeCase.equalsIgnoreCase("y"));
    }

    @Test
    void test_conditional2() {
        String conditional = "no";
        String changeCase = conditional.toUpperCase();
        assertFalse(changeCase.equalsIgnoreCase("n"));
    }

}