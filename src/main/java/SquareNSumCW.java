//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

import java.util.ArrayList;
import java.util.List;

public class SquareNSumCW {
    public static int squareSum(int[] n) {
        int result = 0;
        if (n != null || n.length!= 0) {
            for (Integer integer : n) {
                result += (int) Math.pow (integer, 2);
            }

        }
       return result;
    }
}
