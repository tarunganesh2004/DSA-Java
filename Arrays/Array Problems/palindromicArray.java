import java.util.Scanner;

class palindromicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int r = palindromeArray(n, arr);
        System.out.println(r);
        sc.close();
    }

    public static int palindromeArray(int n, int[] a) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            int reversed = 0;
            while (a[i] > 0) {
                int rem = a[i] % 10;
                reversed = reversed * 10 + rem;
                a[i] = a[i] / 10;
            }
            if (temp == reversed) {
                c++;
            }
        }
        if (c == n) {
            return 1;
        } else {
            return 0;
        }
    }
}