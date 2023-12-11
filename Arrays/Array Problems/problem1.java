import java.util.Arrays;

class problem1 {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // required output 1,4,2,5,3,6
        int r[] = shuffleArray(a);
        int r1[] = test(a);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(r1));
    }

    public static int[] shuffleArray(int[] a) {
        int n = a.length / 2;
        int[] d = new int[2 * n];
        for (int i = 0; i < n; i++) {
            d[2 * i] = a[i];
            d[2 * i + 1] = a[n + i];
        }
        return d;
    }

    // other way (worst case) without creating new array
    //
    public static int[] test(int[] arr) {
        int n = arr.length / 2;

        for (int i = 0; i < n; i++) {
            // Save the element to be inserted
            int temp = arr[n + i];

            // Shift the second half elements to the right
            for (int j = n + i; j > 2 * i + 1; j--) {
                arr[j] = arr[j - 1];
            }

            // Insert the saved element at the correct position
            arr[2 * i + 1] = temp;
        }
        return arr;
    }
}