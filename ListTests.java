import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.Arrays;

public class ListTests {
	@Test
    public void filterTest() {
        StringChecker sc = new StringCheckerOne();
        List<String> input1 = Arrays.asList(new String[]{"a", "abcd", "adfsdf", "ab"});
        assertEquals(ListExamples.filter(input1, sc), Arrays.asList(new String[]{"abcd", "adfsdf"}));
    }

    @Test
    public void mergeTest() {
        List<String> input1 = Arrays.asList(new String[]{"a", "c", "d", "r"});
        List<String> input2 = Arrays.asList(new String[]{"b", "e", "f", "g"});
        assertEquals(ListExamples.merge(input1, input2), Arrays.asList("a", "b", "c", "d", "e", "f", "g", "r"));
    }

}