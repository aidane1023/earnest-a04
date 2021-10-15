package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {
    @Test
    void test_organizeData() {
        Solution42 app = new Solution42();
        String[] expected = {"This", "is", "a", "test"};

        String[] actual = app.organizeData("This,is,a,test");

        assertArrayEquals(expected, actual);
    }
}