package baseline;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {
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
    public void test_bufferedReader() {
        String testString = "test";
        String line;
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new StringReader(testString));
            while((line = reader.readLine()) != null)
            {
                text.append(line);
            }
            reader.close();
            assertEquals(testString, text.toString());
        }
        catch (IOException e) {
            System.out.println("error, fail");
        }
    }

}