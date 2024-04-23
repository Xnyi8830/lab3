import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  /*  
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  */

  @Test
  public void testReverseInPlace() {
      int[] arr1 = {1, 2, 3, 4, 5};
      ArrayExamples.reverseInPlace(arr1);
      assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr1);

      int[] arr2 = {};
      ArrayExamples.reverseInPlace(arr2);
      assertArrayEquals(new int[]{}, arr2);

      int[] arr3 = {1};
      ArrayExamples.reverseInPlace(arr3);
      assertArrayEquals(new int[]{1}, arr3);

      int[] arr4 = {1, 2};
      ArrayExamples.reverseInPlace(arr4);
      assertArrayEquals(new int[]{2, 1}, arr4);
  }

  @Test
  public void testReversed() {
      int[] arr1 = {1, 2, 3, 4, 5};
      int[] reversedArr1 = ArrayExamples.reversed(arr1);
      assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reversedArr1);

      int[] arr2 = {};
      int[] reversedArr2 = ArrayExamples.reversed(arr2);
      assertArrayEquals(new int[]{}, reversedArr2);

      int[] arr3 = {1};
      int[] reversedArr3 = ArrayExamples.reversed(arr3);
      assertArrayEquals(new int[]{1}, reversedArr3);

      int[] arr4 = {1, 2};
      int[] reversedArr4 = ArrayExamples.reversed(arr4);
      assertArrayEquals(new int[]{2, 1}, reversedArr4);
  }

  @Test
  public void testAverageWithoutLowest() {
      double[] arr1 = {1, 2, 3, 4, 5};
      assertEquals(3.5, ArrayExamples.averageWithoutLowest(arr1), 0.01);

      double[] arr2 = {};
      assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr2), 0.01);

      double[] arr3 = {1};
      assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr3), 0.01);

      double[] arr4 = {5, 5, 5};
      assertEquals(5.0, ArrayExamples.averageWithoutLowest(arr4), 0.01);

      double[] arr5 = {5, 5, 5, 5, 5};
      assertEquals(5.0, ArrayExamples.averageWithoutLowest(arr5), 0.01);
  }



}
