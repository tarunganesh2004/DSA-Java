class twoSum {
    public static boolean twosum(int[] a, int t) {
        // Two Pointer Approach
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int s = a[i] + a[j];
            if (s == t) {
                return true;
            } else if (s < t) {
                i++;
            } else {
                j--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] k = { 1, 1, 2, 3, 4, 6, 8, 9 };
        int n = 11;
        boolean result = twosum(k, n);
        System.out.println(result);
    }
}