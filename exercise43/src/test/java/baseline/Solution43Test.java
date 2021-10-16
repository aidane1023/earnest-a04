package baseline;

import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    @Test
    void test_fileWrite() {
        String test = "testCase.txt";
        try {
            FileWriter myWriter = new FileWriter(test);
            myWriter.write("some message");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("test failed");
        }
    }

    @Test
    void test_conditional1() {
        String conditional = "yes";
        boolean gate = false;
        if (conditional.equalsIgnoreCase( "y") || conditional.equalsIgnoreCase("n")) {
            gate = false;
        }
        else {
            gate = true;
        }

        assertTrue(gate);
    }

    @Test
    void test_conditional2() {
        String conditional = "y";
        boolean gate = false;
        if (conditional.equalsIgnoreCase( "y") || conditional.equalsIgnoreCase("n")) {
            gate = true;
        }
        else {
            gate = false;
        }

        assertTrue(gate);
    }

}