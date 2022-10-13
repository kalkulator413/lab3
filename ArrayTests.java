import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    input1 = new int[]{1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(input1, new int[]{4, 3, 2, 1});

    input1 = new int[]{1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(input1, new int[]{1});
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    input1 = new int[]{1, 2, 3, 4};
    assertArrayEquals(ArrayExamples.reversed(input1), new int[]{4, 3, 2, 1});

    input1 = new int[]{1};
    assertArrayEquals(ArrayExamples.reversed(input1), new int[]{1});
  }

  @Test
  public void testSumWithoutLowest() {
    double[] input1 = { };
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 0, .1);

    input1 = new double[]{1};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 0, .1);

    input1 = new double[]{1, 1};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 1, .1);

    input1 = new double[]{1, 1, 2};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 1.5, .1);

  }
}
