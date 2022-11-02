//assertEquals(9, Kata.squareSum(new int[] {1,2,2}));
//   assertEquals(5, Kata.squareSum(new int[] {1,2}));
//   assertEquals(50, Kata.squareSum(new int[] {5,-3,4}));
//   assertEquals(0, Kata.squareSum(new int[] {}));

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareNSumCWTest {
@Test
public void testSquareSum_AllNumbersPositive() {
    int[] n = {1,2,2};

    int expectedResult = 9;
    int actualResult = SquareNSumCW.squareSum (n);
    Assert.assertEquals (actualResult,expectedResult);
}
}
