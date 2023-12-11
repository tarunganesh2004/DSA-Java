public class thirdlargest {
    public static void main(String[] args) {
        int[] a = { 45, 21, 56, 7, 32, 93, 54 };
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max3 = max2;
                max2 = a[i];
            } else if (a[i] > max3) {
                max3 = a[i];
            }
        }

        System.out.println(max3);
    }
}
