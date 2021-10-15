package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    @Test
    void test_sortAlphabet() throws IOException {
        Solution41 app = new Solution41();
        File inputFile = new File("src\\main\\resources\\exercise41_input.txt");

        List<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");

        List<String> actual;
        actual = app.sortAlphabet(inputFile);

        assertEquals(actual, expected);

    }

}