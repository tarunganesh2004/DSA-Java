// Minimize maximum pair sum in an array
// he pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.

// For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
// Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:

// Each element of nums is in exactly one pair, and
// The maximum pair sum is minimized.
// Return the minimized maximum pair sum after optimally pairing up the elements.

import java.util.Arrays;

class minimize {
    public static int maximum(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int pairSum = arr[start] + arr[end];
            max = Math.max(max, pairSum);
            start++;
            end--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 3, 2 };
        int r = maximum(a);
        System.out.println(r);
    }
}
