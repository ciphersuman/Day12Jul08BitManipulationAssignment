package Q2;

/**
 * Reverse Bits
 * Problem Description
 *
 * Reverse the bits of an 32 bit unsigned integer A.
 *
 *
 *
 * Problem Constraints
 * 0 <= A <= 232
 *
 *
 *
 * Input Format
 * First and only argument of input contains an integer A.
 *
 *
 *
 * Output Format
 * Return a single unsigned integer denoting the decimal value of reversed bits.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  0
 * Input 2:
 *
 *  3
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  3221225472
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *         00000000000000000000000000000000
 * =>      00000000000000000000000000000000
 * Explanation 2:
 *
 *         00000000000000000000000000000011
 * =>      11000000000000000000000000000000
 */

public class Solution {
    public long reverse(long a) {
        long y=0l;
        for(long i=0l;i<=31l;i++)
        {
            if((a & (1l<<i))>0l)
            {
                y=y|(1l<<(31l-i));
            }
        }

        return y;
    }
}
