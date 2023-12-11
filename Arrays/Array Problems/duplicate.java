// Remove duplicates in a array

import java.util.Arrays;
import java.util.HashSet;

public class duplicate {

    // By using hashset
    public static int[] removeDuplicatesBySet(int[] arr) {
        // int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int value : arr) {
            set.add(value);
        }

        // convert hashset to array
        int[] unq = new int[set.size()];
        int index = 0;
        for (int value : set) {
            unq[index++] = value;
        }
        return unq;
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        int[] a = new int[j];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 2, 2, 1, 4, 5, 6, 6, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(Arrays.toString(removeDuplicates(a)));
        System.out.println(findLength(a));
        System.out.println(Arrays.toString(remove(a)));
    }

    public static int findLength(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    // Another implementation
    public static int[] remove(int[] arr) {
        int n = arr.length;
        // Sort the array to group duplicate elements together
        Arrays.sort(arr);

        // count no.of unique elements
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                c++;
            }
        }

        int[] uniqueArray = new int[c];
        uniqueArray[0] = arr[0];
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArray[j] = arr[i];
                j++;
            }
        }
        return uniqueArray;
    }
}