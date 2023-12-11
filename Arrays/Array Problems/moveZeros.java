import java.util.Arrays;

public class moveZeros {
    public static int[] move(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j = j + 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 2, 0 };
        System.out.println(Arrays.toString(move(a)));
    }
}
