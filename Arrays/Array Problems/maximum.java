public class maximum {
    public static int maximumSum(int[] arr) {
        int max = 0;
        int sum = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i != j) {
                sum = arr[i] + arr[j];
                // j++;
            } else {
                sum = arr[i];
            }
            max = Math.max(sum, max);
            j = i;

        }
        return max;

    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 3, 2 };
        int r = maximumSum(a);
        System.out.println(r);
    }
}
