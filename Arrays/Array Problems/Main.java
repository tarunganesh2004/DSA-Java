import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] a = { 1, 1, 2, 4, 2, 5, 3 };
        Arrays.sort(a);
        // System.out.println(m.remove(a));
        System.out.println(Arrays.toString(m.removeDuplicates(a)));
    }

    int remove(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[j]) {
                j = j + 1;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[j]) {
                j = j + 1;
                arr[j] = arr[i];
            }
        }
        // return j + 1;
        int[] u = new int[j + 1];
        for (int i = 0; i <= j; i++) {
            u[i] = arr[i];
        }
        return u;
    }
}
