import java.util.Scanner;

public class maxProfit {
    public static int profit(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int max = arr[j] - arr[i];
                if (max > n) {
                    n = max;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(profit(a));
        sc.close();
    }
}
