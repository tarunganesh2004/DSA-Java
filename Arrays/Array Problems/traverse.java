// package Array Problems;

import java.util.Arrays;

class traverse {
    public static void main(String[] args) {
        traverse t = new traverse();
        int[] a = { 1, 2, 5, 7, 3 };
        // System.out.println(Arrays.toString(t.traverseArray(a)));
        // System.out.println(Arrays.toString(t.reverseArray(a)));
        // System.out.println(Arrays.toString(reverseArray(a)));
        pointers(a);
    }

    int[] traverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return arr;
    }

    public static void pointers(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}