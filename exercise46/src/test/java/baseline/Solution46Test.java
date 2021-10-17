package baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {
    @Test
    void test_readInputFile() {
        String test = """
                this is a test
                this is a
                this is
                this
                """;
        String line;
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new StringReader(test));
            while((line = reader.readLine()) != null)
            {
                text.append(line).append("\n");
            }
            reader.close();
            assertEquals(test, text.toString());
        }
        catch (IOException e) {
            System.out.println("error, fail");
        }
    }
    @Test
    void test_buildFrequencyMap() {
        Map<String, Integer> freqMap = new HashMap<>();

        List<String> testList = new ArrayList<>();
        testList.add("This");
        testList.add("This");
        testList.add("is");
        testList.add("a");
        testList.add("a");
        testList.add("a");
        testList.add("test");

        testList.forEach(s -> {
            if (freqMap.containsKey(s)) {
                //Use counter to record frequency
                Integer count = freqMap.get(s);
                freqMap.put(s, count + 1);
            } else {
                freqMap.put(s, 1);
            }
        });
        assertEquals(1, freqMap.get("test"));
        assertEquals(3, freqMap.get("a"));
        assertEquals(1, freqMap.get("is"));
        assertEquals(2, freqMap.get("This"));
    }

}