package baseline;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {

    @Test
    public void test_jsonReaderParse() {
        String testString = "test";
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(testString));
            jsonReader.beginObject();
            String name = jsonReader.nextName();
            assertSame("test", name);
            jsonReader.endObject();
        }
        catch (IOException e) {
            System.out.println("error, fail");
        }
    }

    @Test
    //Test if contains operates as expected
    public void test_compare() {
        String[] testArray = {"this", "is", "a", "test"};
        String index;

        index = testArray[3];
        assertTrue(Arrays.asList(testArray).contains(index));

    }

}